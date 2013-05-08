package controllers;

import models.Pelicula;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.cliente.comprar;
import views.html.cliente.index;
import views.html.cliente.fichaPelicula;
import views.html.cliente.butacas;
import views.html.cliente.pagar;
import views.html.cliente.tickets;

public class ClienteController extends Controller {

	public static Result index() {
		return ok(index.render(Pelicula.all(), peliculaForm, null));
	}

	public static Result verFichaPelicula(Long id) {

		Pelicula pelicula = Pelicula.find.ref(id);

		return ok(fichaPelicula.render(pelicula));

	}

	public static Result comprarEntrada() {

		return ok(comprar.render(Pelicula.all()));

		// return
		// redirect(controllers.routes.ClienteController.comprarEntrada().toString()
		// + "#" + id);
	}

	public static Result seleccionButacas(Long id) {

		Pelicula pelicula = Pelicula.find.ref(id);

		return ok(butacas.render(pelicula));

	}

	public static Result pagar() {
		
		return ok(pagar.render());
	}
	
	public static Result tickets() {
		
		return ok(tickets.render());
	}

	static Form<Pelicula> peliculaForm = Form.form(Pelicula.class);

}
