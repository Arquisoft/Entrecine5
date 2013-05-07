package controllers;

import models.Pelicula;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.taquilla.comprar;
import views.html.taquilla.fichaPelicula;
import views.html.taquilla.index;

public class TaquillaController extends Controller{

	public static Result index() {
		return ok(index.render(Pelicula.all(), peliculaForm, null));
	}

	public static Result verFichaPelicula(Long id) {

		Pelicula pelicula = Pelicula.find.ref(id);

		return ok(fichaPelicula.render(pelicula));

	}

	public static Result comprarEntrada(Long id) {

		Pelicula pelicula = Pelicula.find.ref(id);
		
		return ok(comprar.render(pelicula));

		// return
		// redirect(controllers.routes.ClienteController.comprarEntrada().toString()
		// + "#" + id);
	}

	static Form<Pelicula> peliculaForm = Form.form(Pelicula.class);

}
