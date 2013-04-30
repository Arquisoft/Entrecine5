<<<<<<< HEAD
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

public class FechasEscenarios extends Steps{

	Pelicula pelicula;
	TipoSesion tipoSesion;
	Sesion sesion;
	Usuario usuario = new Usuario();
	Entrada entrada;
	Date fechaCompra;
	
	@Given("una pelicula llamada $titulo que se estrena el dia " +
			"$fechaInicio hasta $fechaFin para la sesion $nombreSesion que " +
			"dura desde las $horaInicio hasta $horaFin con precio $precio")
	public void givenUnaPeliculaParaUnaSesion(@Named("titulo") String titulo,
			@Named("fechaInicio") Long fechaInicio, 
			@Named("fechaFin") Long fechaFin, 
			@Named("nombreSesion") String nombreSesion,
			@Named("horaInicio") Long horaInicio,
			@Named("horaFin") Long horaFin,
			@Named("precio") Double precio) {
		//Pelicula
		pelicula = new Pelicula();
		pelicula.titulo = titulo;
		pelicula.fechaInicioCartelera = new Date(fechaInicio);
		pelicula.fechaFinCartelera = new Date(fechaFin);
		//Tipo de sesion
		tipoSesion = new TipoSesion();
		tipoSesion.nombre = nombreSesion;
		tipoSesion.precio = precio;
		//Sesion
		sesion = new Sesion();
		sesion.horaInicio = new Date(horaInicio);
		sesion.horaFin = new Date(horaFin);
		//Asociaciones
		sesion.tipoSesion = tipoSesion;
		sesion.pelicula = pelicula;
	}
	
	@When("yo compro una entrada el dia $diaHora para la fila $fila asiento $asiento")
	public void whenComproEntradaUnDia(@Named("diaHora") Long diaHora,
			@Named("fila") Integer fila, 
			@Named("asiento") Integer asiento) {
		entrada = new Entrada();
		entrada.numFila = fila;
		entrada.numAsiento = asiento;
		entrada.usuario = usuario;
		entrada.sesion = sesion;
		fechaCompra = new Date(diaHora);
	}
	
	@Then("la entrada deberia venderse")
	public void thenLaEntradaDeberiaVenderse() {
		if (entrada.sesion.horaInicio.before(fechaCompra))
			throw new RuntimeException("La entrada se ha vendido despues de " +
					"iniciarse la sesión");
	}
	
	@Then("la entrada no deberia venderse")
	public void thenLaEntradaNoDeberiaVenderse() {
		if (entrada.sesion.horaInicio.after(fechaCompra))
			throw new RuntimeException("La entrada se ha vendido, y no deberia ");
	}
	
}
=======
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

public class FechasEscenarios extends Steps{

	Pelicula pelicula;
	TipoSesion tipoSesion;
	Sesion sesion;
	Usuario usuario = new Usuario();
	Entrada entrada;
	Date fechaCompra;
	
	@Given("una pelicula llamada $titulo que se estrena el dia " +
			"$fechaInicio hasta $fechaFin para la sesion $nombreSesion que " +
			"dura desde las $horaInicio hasta $horaFin con precio $precio")
	public void givenUnaPeliculaParaUnaSesion(@Named("titulo") String titulo,
			@Named("fechaInicio") Long fechaInicio, 
			@Named("fechaFin") Long fechaFin, 
			@Named("nombreSesion") String nombreSesion,
			@Named("horaInicio") Long horaInicio,
			@Named("horaFin") Long horaFin,
			@Named("precio") Double precio) {
		//Pelicula
		pelicula = new Pelicula();
		pelicula.titulo = titulo;
		pelicula.fechaInicioCartelera = new Date(fechaInicio);
		pelicula.fechaFinCartelera = new Date(fechaFin);
		//Tipo de sesion
		tipoSesion = new TipoSesion();
		tipoSesion.nombre = nombreSesion;
		tipoSesion.precio = precio;
		//Sesion
		sesion = new Sesion();
		sesion.horaInicio = new Date(horaInicio);
		sesion.horaFin = new Date(horaFin);
		//Asociaciones
		sesion.tipoSesion = tipoSesion;
		sesion.pelicula = pelicula;
	}
	
	@When("yo compro una entrada el dia $diaHora para la fila $fila asiento $asiento")
	public void whenComproEntradaUnDia(@Named("diaHora") Long diaHora,
			@Named("fila") Integer fila, 
			@Named("asiento") Integer asiento) {
		entrada = new Entrada();
		entrada.numFila = fila;
		entrada.numAsiento = asiento;
		entrada.usuario = usuario;
		entrada.sesion = sesion;
		fechaCompra = new Date(diaHora);
	}
	
	@Then("la entrada deberia venderse")
	public void thenLaEntradaDeberiaVenderse() {
		if (entrada.sesion.horaInicio.before(fechaCompra))
			throw new RuntimeException("La entrada se ha vendido despues de " +
					"iniciarse la sesión");
	}
	
	@Then("la entrada no deberia venderse")
	public void thenLaEntradaNoDeberiaVenderse() {
		if (entrada.sesion.horaInicio.after(fechaCompra))
			throw new RuntimeException("La entrada se ha vendido, y no deberia ");
	}
	
}
>>>>>>> 713dbdd71b9da6a84b8a7598d40268e0853a18aa
