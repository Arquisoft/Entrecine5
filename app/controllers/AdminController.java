package controllers;

import models.Pelicula;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.admin.anadir;
import views.html.admin.index;

public class AdminController extends Controller {

	public static Result index() {
		return ok(index.render(Pelicula.all(), peliculaForm));
	}

	public static Result nuevaPelicula() {
		return ok(anadir.render(peliculaForm));
	}

	public static Result crearPelicula() {

		Form<Pelicula> formularioCumplimentado = peliculaForm.bindFromRequest();

		if (formularioCumplimentado.hasErrors()) {
			return badRequest(index.render(Pelicula.all(), peliculaForm));
		}

		Pelicula.create(formularioCumplimentado.get());
		return redirect(routes.AdminController.index());

	}

	public static Result eliminarPelicula(Long id) {

		Pelicula.remove(id);

		return redirect(routes.ClienteController.index());
	}

	static Form<Pelicula> peliculaForm = Form.form(Pelicula.class);

}
