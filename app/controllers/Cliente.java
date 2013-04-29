package controllers;

import models.Pelicula;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.cliente.comprar;
import views.html.cliente.index;

public class Cliente extends Controller {

	public static Result index() {
		return ok(index.render(Pelicula.all(), peliculaForm));
	}

	public static Result comprarEntrada(Long id) {

		Pelicula pelicula = Pelicula.find.ref(id);

		return ok(comprar.render(pelicula));
	}

	static Form<Pelicula> peliculaForm = Form.form(Pelicula.class);

}
