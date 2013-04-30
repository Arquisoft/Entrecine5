package peliculas;

import java.util.Date;

import models.Entrada;
import models.Pelicula;
import models.Sesion;
import models.TipoSesion;
import models.Usuario;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

public class PreciosEscenarios extends Steps {

	Pelicula pelicula;
	TipoSesion tipoSesion;
	Sesion sesion;
	Usuario usuario = new Usuario();
	Entrada entrada;
	Date fechaCompra;
	double precioFinal;
	int numEntradas;

	@Given("una pelicula llamada $titulo de la sesion $nombreSesion"
			+ "tiene un precio $precio")
	public void givenUnaPeliculaParaUnaSesion(@Named("titulo") String titulo,
			@Named("nombreSesion") String nombreSesion,
			@Named("precio") Double precio) {
		// Pelicula
		pelicula = new Pelicula();
		pelicula.titulo = titulo;
		// Tipo de sesion
		tipoSesion = new TipoSesion();
		tipoSesion.nombre = nombreSesion;
		tipoSesion.precio = precio;
		// Sesion
		sesion = new Sesion();
		// Asociaciones
		sesion.tipoSesion = tipoSesion;
		sesion.pelicula = pelicula;
	}

	@When("yo compro $numeroEntradas entradas")
	public void whenComproEntradas(@Named("numeroEntradas") Integer numeroEntradas) {
		for(int i=1; i<=numeroEntradas; i++){
			entrada = new Entrada();
			entrada.numFila = 1;
			entrada.numAsiento = i;
			entrada.usuario = usuario;
			entrada.sesion = sesion;
			sesion.entradas.add(entrada);
		}
		
		numEntradas = numeroEntradas;
		precioFinal = numeroEntradas * sesion.tipoSesion.precio;
		
	}

	@Then("el precio final a pagar y el numero de entradas compradas debe ser correcto")
	public void thenElPrecioDeberiaSerCorrecto() {
		if (sesion.entradas.size() != numEntradas)
			throw new RuntimeException("El número de entradas vendido no es correcto");
		if((sesion.entradas.size() * sesion.tipoSesion.precio) != precioFinal)
			throw new RuntimeException("El precio final de la compra no es correcto");
			
	}

}
