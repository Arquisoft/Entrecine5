package es.uniovi.asw.entrecine;

import static org.fest.assertions.Assertions.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dadas;
import cucumber.api.java.es.Entonces;


public class ReservasSesionOcupadas {

	private List<Reserva> reservas = new ArrayList<Reserva>();
	private TipoSesion tipo = new Diario(6.5);
	private Sesion sesion = new Sesion(1, tipo);
	private Date fecha_inicio_cartelera = convertirFecha("04-04-2013");
	private Date fecha_fin_cartelera = convertirFecha("12-04-2013");
	private Pelicula pelicula = new Pelicula(1, "COD1", 120,
			fecha_fin_cartelera, fecha_inicio_cartelera, "cartel.png",
			"Pelicula1", "Pelicula de accion");
	private Date horaInicio = convertirHora("17:00");
	private HorarioPelicula horario = new HorarioPelicula(1, pelicula, (long) 1, horaInicio);
	private Sala sala = new Sala(1, 1);

	@Dadas("^las siguientes butacas a reservar:$")
	public void las_siguientes_butacas_a_reservar(List<Entry> entries) throws Throwable {
		int id = 1;
		for (Entry e : entries) {
			ButacaOcupada butaca = new ButacaOcupada(horario, e.fila_butaca, e.columna_butaca, id, sala);
			Reserva reserva = new Reserva(sesion, butaca, EstadoReserva.VENDIDO, null);
			reservas.add(reserva);
			id++;
		}
	}

	@Cuando("^Yo voy a verificar la reserva$")
	public void Yo_voy_a_verificar_la_reserva() throws Throwable {
	}

	@Entonces("^las butacas ocupadas seran:$")
	public void las_butacas_ocupadas_seran(List<Entry> ocupadas) throws Throwable {
		
		int id = 1;
		int i=0;
		for (Entry e : ocupadas) {
			ButacaOcupada bt= reservas.get(i).getButacaOcupada();
			ButacaOcupada butaca = new ButacaOcupada(horario, e.fila_butaca, e.columna_butaca, id, sala);
			assertThat(bt.getColumna_butaca()).isEqualTo(butaca.getColumna_butaca());
			assertThat(bt.getFila_butaca()).isEqualTo(butaca.getFila_butaca());
			i++;
			id++;
		}
	}

	private Date convertirFecha(String fecha) {
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
		Date fechaEnviar = null;
		try {
			fechaEnviar = (Date) formatoDelTexto.parse(fecha);
			return fechaEnviar;
		} catch (ParseException ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	private Date convertirHora(String hora) {
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("HH:mm");
		Date horaEnviar = null;
		try {
			horaEnviar = (Date) formatoDelTexto.parse(hora);
			return horaEnviar;
		} catch (ParseException ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	public class Entry {
        Integer fila_butaca;
        Integer columna_butaca;
    }

}
