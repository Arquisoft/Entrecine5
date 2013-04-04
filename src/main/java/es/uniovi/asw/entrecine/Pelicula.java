package es.uniovi.asw.entrecine;

import java.util.Date;

public class Pelicula {

	private int id;
	private String codigo;
	private int duracion;
	private Date fecha_fin_cartelera;
	private Date fecha_inicio_cartelera;
	private String foto;
	private String nombre;
	private String sinopsis;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public Date getFecha_fin_cartelera() {
		return fecha_fin_cartelera;
	}
	public void setFecha_fin_cartelera(Date fecha_fin_cartelera) {
		this.fecha_fin_cartelera = fecha_fin_cartelera;
	}
	public Date getFecha_inicio_cartelera() {
		return fecha_inicio_cartelera;
	}
	public void setFecha_inicio_cartelera(Date fecha_inicio_cartelera) {
		this.fecha_inicio_cartelera = fecha_inicio_cartelera;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public Pelicula(int id, String codigo, int duracion,
			Date fecha_fin_cartelera, Date fecha_inicio_cartelera, String foto,
			String nombre, String sinopsis) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.duracion = duracion;
		this.fecha_fin_cartelera = fecha_fin_cartelera;
		this.fecha_inicio_cartelera = fecha_inicio_cartelera;
		this.foto = foto;
		this.nombre = nombre;
		this.sinopsis = sinopsis;
	}
	
	
}
