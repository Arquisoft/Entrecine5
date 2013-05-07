package controllers;

import models.Pelicula;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.cliente.comprar;
import views.html.cliente.index;
import views.html.cliente.fichaPelicula;

public class ClienteController extends Controller {
	
	

	public static Result index() {
		return ok(index.render(Pelicula.all(), peliculaForm, null));
	}
	
	public static Result verFichaPelicula(Long id){
		
		Pelicula pelicula = Pelicula.find.ref(id);

		return ok(fichaPelicula.render(pelicula));
		
	}

	public static Result comprarEntrada() {

		return ok(comprar.render(Pelicula.all()));
		
		//return redirect(controllers.routes.ClienteController.comprarEntrada().toString() + "#" + id);
	}

	static Form<Pelicula> peliculaForm = Form.form(Pelicula.class);

}
