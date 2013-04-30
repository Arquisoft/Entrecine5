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
