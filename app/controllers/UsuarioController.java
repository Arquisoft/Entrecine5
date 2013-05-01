<<<<<<< HEAD
package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.usuario.registro;

public class UsuarioController extends Controller{
	
	public static Result registroNuevo(){
		return ok(registro.render());
	}
	
	
	static Form<UsuarioController> usuarioForm = Form.form(UsuarioController.class);

}
=======
package controllers;

import models.Usuario;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.usuario.registro;

public class UsuarioController extends Controller {

	public static Usuario isSesionIniciada() {

		Usuario usuario = null;
		String usuarioId = session("usuarioId");

		if (usuarioId != null) {
			usuario = Usuario.find.ref(Long.parseLong(usuarioId));

			if (usuario != null) {
				session("usuarioId", usuarioId);
			}
		}

		return usuario;

	}

	public static Result registroNuevo() {
		return ok(registro.render());
	}

	static Form<UsuarioController> usuarioForm = Form
			.form(UsuarioController.class);

}
>>>>>>> faeb9728ab57920262f61a2308c697c27978f5c5
