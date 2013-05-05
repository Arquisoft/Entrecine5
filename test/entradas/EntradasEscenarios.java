package entradas;

import models.Entrada;
import models.Pelicula;
import models.Usuario;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

import controllers.UsuarioController;

public class EntradasEscenarios extends Steps{
	
	Usuario usuario1;
	Usuario usuario2;
	Entrada entrada;
	
	@Given("una persona que compra una entrada para la " +
			"fila $fila asiento $asiento")
	public void givenPersonaCompraEntrada(@Named("fila") Integer fila,
			@Named("asiento") Integer asiento) {
		usuario1 = new Usuario();
		entrada = new Entrada();
		entrada.numFila = fila;
		entrada.numAsiento = asiento;
		UsuarioController.comprarEntrada(usuario1,entrada);
	}
	
	@When("otra persona compra la misma entrada")
	public void whenAdminIntroduceUnaNueva() {
		usuario2 = new Usuario();
		UsuarioController.comprarEntrada(usuario2,entrada);
	}
	
	@Then("el sistema no deberia permitirlo")
	public void thenSistemaNoDeberiaDejar() {
		if (entrada.usuario != usuario1)
			throw new RuntimeException("La entrada se ha vendido incorrectamente");
	}
	
	
	
}
