package admin;

import models.Pelicula;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

public class PeliculasEscenarios extends Steps{
	
	@Given("un cine que tiene $numPeliculas peliculas")
	public void givenCineConPelis(@Named("numPeliculas") Integer nPelis) {
		int i=0;
		Pelicula peli = null;
		while (i<nPelis)
		{
			peli = new Pelicula();
			peli.id = (long) i;
			Pelicula.create(peli);
			i++;
		}
	}
	
	@When("el admin introduce una nueva")
	public void whenAdminIntroduceUnaNueva() {
		Pelicula peli = new Pelicula();
		peli.id = (long) Pelicula.all().size();
		Pelicula.create(peli);
	}
	
	@When("el admin elimina una")
	public void whenAdminEliminaUna() {
		Pelicula.remove((long)Pelicula.all().size()-1);
	}
	
	@Then("el cine tiene $numPeliculas peliculas")
	public void thenCineTiene(@Named("numPeliculas") Integer nPelis) {
		if (nPelis != Pelicula.all().size())
			throw new RuntimeException("El numero de peliculas no es correcto");
	}
	
	
	
}
