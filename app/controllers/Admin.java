package controllers;

import models.Pelicula;
import models.Sesion;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.admin.anadir;
import views.html.admin.index;
import views.html.admin.sesiones;
import views.html.admin.anadirSesion;

public class Admin extends Controller {

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
		return redirect(routes.Admin.index());

	}

	public static Result eliminarPelicula(Long id) {

		Pelicula.remove(id);

		return redirect(routes.Cliente.index());
	}
	
	public static Result verSesiones() {
		return ok(sesiones.render(Sesion.all(), sesionForm));
	}
	
	public static Result nuevaSesion() {
		return ok(anadirSesion.render(sesionForm));
	}
	
	public static Result crearSesion() {

		Form<Sesion> formularioCumplimentado = sesionForm.bindFromRequest();

		if (formularioCumplimentado.hasErrors()) {
			return badRequest(sesiones.render(Sesion.all(), sesionForm));
		}

		Sesion.create(formularioCumplimentado.get());
		return redirect(routes.Admin.verSesiones());

	}
	
	public static Result eliminarSesion(Long id) {

		Sesion.remove(id);

		return redirect(routes.Admin.verSesiones());
	}
	
	static Form<Pelicula> peliculaForm = Form.form(Pelicula.class);
	static Form<Sesion> sesionForm = Form.form(Sesion.class);

}
