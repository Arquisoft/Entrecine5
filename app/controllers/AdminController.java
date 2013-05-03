package controllers;

import models.Pelicula;
import models.Sala;
import models.Sesion;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.admin.anadir;
import views.html.admin.index;
import views.html.admin.sesiones;
import views.html.admin.anadirSesion;
import views.html.admin.salas;
import views.html.admin.anadirSala;
import views.html.admin.editarPelicula;
import views.html.admin.editarSesion;

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
	
	public static Result editarPelicula(Long id){
		
		Pelicula pelicula = Pelicula.find.ref(id);

		return ok(editarPelicula.render(pelicula,peliculaForm));
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
		return redirect(routes.AdminController.verSesiones());

	}
	
	public static Result eliminarSesion(Long id) {

		Sesion.remove(id);


		return redirect(routes.AdminController.verSesiones());
	}
	
	public static Result editarSesion(Long id){
		
		Sesion sesion = Sesion.find.ref(id);

		return ok(editarSesion.render(sesion,sesionForm));
	}
	
	public static Result actualizarSesion(){
		
		Form<Sesion> formularioCumplimentado = sesionForm.bindFromRequest();

		if (formularioCumplimentado.hasErrors()) {
			return badRequest(sesiones.render(Sesion.all(), sesionForm));
		}

		Sesion sesion = formularioCumplimentado.get();
		
		Sesion.create(sesion);
		return redirect(routes.AdminController.verSesiones());
	}
	
	public static Result verSalas() {
		return ok(salas.render(Sala.all(), salaForm));
	}
	
	public static Result nuevaSala() {
		return ok(anadirSala.render(salaForm));
	}
	
	public static Result crearSala() {

		Form<Sala> formularioCumplimentado = salaForm.bindFromRequest();

		if (formularioCumplimentado.hasErrors()) {
			return badRequest(salas.render(Sala.all(), salaForm));
		}

		Sala.create(formularioCumplimentado.get());
		return redirect(routes.AdminController.verSalas());

	}
	
	public static Result eliminarSala(String id) {

		Sala.remove(id);
		

		return redirect(routes.AdminController.verSalas());
	}

	static Form<Pelicula> peliculaForm = Form.form(Pelicula.class);
	static Form<Sesion> sesionForm = Form.form(Sesion.class);
	static Form<Sala> salaForm = Form.form(Sala.class);

}
