package test.java.es.uniovi.asw.entrecine;

import static org.fest.assertions.Assertions.assertThat;
import cucumber.api.java.es.Dada;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Cuando;
import main.java.es.uniovi.asw.entrecine.*;

public class AsientosSteps {
	
	private Cinema c;
	private Seat s;
	
	@Dada("^una butaca en la fila (\\d+) con el numero (\\d+)$")
	public void una_butaca_concreta(int row, int number) throws Throwable {
	    c = new Cinema(5, 10);
	    s = c.getSeat(row, number);
	}

	@Cuando("^Yo pregunto si esta ocupada$")
	public void Yo_pregunto_su_ocupacion() throws Throwable {
	}

	@Entonces("^el resultado debe ser (\\s+)$")
	public void el_resultado_debe_ser(boolean isBusy) throws Throwable {
		assertThat(isBusy).isEqualTo(s.getIsBusy());
	}

}