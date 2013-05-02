package controllers;

import models.Usuario;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.usuario.registro;

public class UsuarioController extends Controller {

	public class Login {
		String email;
		String password;
	}

	// public static Usuario isSesionIniciada() {
	//
	// Usuario usuario = null;
	// String usuarioId = session("usuarioId");
	//
	// if (usuarioId != null) {
	// usuario = Usuario.find.ref(Long.parseLong(usuarioId));
	//
	// if (usuario != null) {
	// session("usuarioId", usuarioId);
	// }
	// }
	//
	// return usuario;
	//
	// }

	public static Result registroNuevo() {
		return ok(registro.render(usuarioForm));
	}

	public static Result iniciarSesion() {

		// Form<Login> loginForm = Form.form(Login.class).bindFromRequest();

		return TODO;

	}

	public static Result crearUsuario() {
		return TODO;
	}

	static Form<Usuario> usuarioForm = Form.form(Usuario.class);

}
