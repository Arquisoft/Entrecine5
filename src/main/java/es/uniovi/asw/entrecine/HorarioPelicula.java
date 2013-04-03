package es.uniovi.asw.entrecine;

import cucumber.api.java.it.Date;

public class HorarioPelicula {
	
	private int id;
	private Pelicula pelicula;
	private Long codHorario;
	private Date horaInicio;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public Long getCodHorario() {
		return codHorario;
	}
	public void setCodHorario(Long codHorario) {
		this.codHorario = codHorario;
	}
	public Date getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}
	public HorarioPelicula(int id,Pelicula pelicula, Long codHorario, Date horaInicio) {
		super();
		
		this.id=id;
		this.pelicula = pelicula;
		this.codHorario = codHorario;
		this.horaInicio = horaInicio;
	}

	
	
	
}
