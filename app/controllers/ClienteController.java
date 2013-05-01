<<<<<<< HEAD
package controllers;

import models.Pelicula;
import models.Usuario;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.cliente.comprar;
import views.html.cliente.index;

public class ClienteController extends Controller {
	
	

	public static Result index() {
		return ok(index.render(Pelicula.all(), peliculaForm, isSesionIniciada()));
	}

	public static Result comprarEntrada(Long id) {

		Pelicula pelicula = Pelicula.find.ref(id);

		return ok(comprar.render(pelicula));
	}
	
	private static Usuario isSesionIniciada(){
		
		Usuario usuario = null;
		String usuarioId = session("usuarioId");
		
		if (usuarioId != null) {
			usuario = Usuario.find.ref(Long.parseLong(usuarioId));
			
			if (usuario != null){
				session("usuarioId", usuarioId);
			}
		}
		
		return usuario;
			
	}

	static Form<Pelicula> peliculaForm = Form.form(Pelicula.class);

}
=======
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
>>>>>>> faeb9728ab57920262f61a2308c697c27978f5c5
