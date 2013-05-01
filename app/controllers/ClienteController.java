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
		return ok(index.render(Pelicula.all(), peliculaForm, UsuarioController.isSesionIniciada()));
	}
	
	public static Result verFichaPelicula(Long id){
		
		Pelicula pelicula = Pelicula.find.ref(id);

		return ok(fichaPelicula.render(pelicula));
		
	}

	public static Result comprarEntrada(Long id) {

		Pelicula pelicula = Pelicula.find.ref(id);

		return ok(comprar.render(pelicula));
	}

	static Form<Pelicula> peliculaForm = Form.form(Pelicula.class);

}
