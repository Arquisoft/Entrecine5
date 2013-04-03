package es.uniovi.asw.entrecine;

import cucumber.api.java.it.Date;

public class Reserva {
	
	private Sesion sesion;
	private ButacaOcupada butacaOcupada;
	private EstadoReserva estado;
	private Date fechaCreacion;
	public Sesion getSesion() {
		return sesion;
	}
	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}
	public ButacaOcupada getButacaOcupada() {
		return butacaOcupada;
	}
	public void setButacaOcupada(ButacaOcupada butacaOcupada) {
		this.butacaOcupada = butacaOcupada;
	}
	public EstadoReserva getEstado() {
		return estado;
	}
	public void setEstado(EstadoReserva estado) {
		this.estado = estado;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	
	public Reserva(Sesion sesion, ButacaOcupada butacaOcupada,
			EstadoReserva estado, Date fechaCreacion) {
		super();
		this.sesion = sesion;
		this.butacaOcupada = butacaOcupada;
		this.estado = estado;
		this.fechaCreacion = fechaCreacion;
	}
	
	
	

}
