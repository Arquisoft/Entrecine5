package controllers;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

import models.Pelicula;
import models.Sala;
import models.Sesion;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.admin.anadir;
import views.html.admin.index;
import views.html.admin.editarSesion;
import views.html.admin.anadirSesion;
import views.html.admin.anadirSala;
import views.html.admin.editarPelicula;
import views.html.admin.fichaPelicula;

public class AdminController extends Controller {

	public static Result index() {
		return ok(index.render(Pelicula.all(), peliculaForm, Sala.all(),
				salaForm, Sesion.all(), sesionForm));
	}
	
	public static Result verFichaPelicula(Long id){
		
		Pelicula pelicula = Pelicula.find.ref(id);

		return ok(fichaPelicula.render(pelicula));
		
	}

	public static Result nuevaPelicula() {
		return ok(anadir.render(peliculaForm));
	}

	public static Result crearPelicula() {

		Form<Pelicula> formularioCumplimentado = peliculaForm.bindFromRequest();

		if (formularioCumplimentado.hasErrors()) {
			
			return badRequest(index.render(Pelicula.all(), peliculaForm, Sala.all(),
					salaForm, Sesion.all(), sesionForm));
		}

		Pelicula.create(formularioCumplimentado.get());
		return redirect(routes.AdminController.index());

	}

	public static Result eliminarPelicula(Long id) {

		Pelicula.remove(id);

		return redirect(routes.ClienteController.index());
	}

	public static Result editarPelicula(Long id) {

		Pelicula pelicula = Pelicula.find.ref(id);

		return ok(editarPelicula.render(pelicula, peliculaForm));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Result guardarCambiosPelicula(Long id){

		Form<Pelicula> formularioCumplimentado = editarPeliculaForm.bindFromRequest();
		
		if (formularioCumplimentado.hasErrors()) {
			return badRequest(index.render(Pelicula.all(), peliculaForm, Sala.all(),
					salaForm, Sesion.all(), sesionForm));
		}
		
		Pelicula.update(formularioCumplimentado.get(),id);
		
		return redirect(routes.AdminController.index());
		
	}
	public static Result nuevaSesion() {
		return ok(anadirSesion.render(sesionForm));
	}

	public static Result crearSesion() {

		Form<Sesion> formularioCumplimentado = sesionForm.bindFromRequest();

		if (formularioCumplimentado.hasErrors()) {
			return badRequest(index.render(Pelicula.all(), peliculaForm, Sala.all(),
					salaForm, Sesion.all(), sesionForm));
		}

		Sesion.create(formularioCumplimentado.get());
		return redirect(routes.AdminController.index());
	}
	
	public static Result editarSesion(Long id){
		
		Sesion sesion = Sesion.find.ref(id);

		return ok(editarSesion.render(sesion,sesionForm));
	}

	
	public static Result actualizarSesion(){
		
		Form<Sesion> formularioCumplimentado = sesionForm.bindFromRequest();

		if (formularioCumplimentado.hasErrors()) {
			return badRequest(index.render(Pelicula.all(), peliculaForm, Sala.all(),
					salaForm, Sesion.all(), sesionForm));
		}

		Sesion sesion = formularioCumplimentado.get();
		
		Sesion.update(sesion, sesion.id);
		return redirect(routes.AdminController.index());
	}

	public static Result eliminarSesion(Long id) {

		Sesion.remove(id);

		return redirect(routes.AdminController.index());
	}

	public static Result nuevaSala() {
		return ok(anadirSala.render(salaForm));
	}

	public static Result crearSala() {

		Form<Sala> formularioCumplimentado = salaForm.bindFromRequest();

		if (formularioCumplimentado.hasErrors()) {
			return badRequest(index.render(Pelicula.all(), peliculaForm, Sala.all(),
					salaForm, Sesion.all(), sesionForm));
		}

		Sala.create(formularioCumplimentado.get());
		return redirect(routes.AdminController.index());

	}

	public static Result eliminarSala(String id) {

		Sala.remove(id);

		return redirect(routes.AdminController.index());
	}

	static Form<Pelicula> peliculaForm = Form.form(Pelicula.class);
	static Form<Pelicula> editarPeliculaForm = Form.form(Pelicula.class);
	static Form<Sesion> sesionForm = Form.form(Sesion.class);
	static Form<Sala> salaForm = Form.form(Sala.class);

}

