package es.uniovi.asw.entrecine;

public class Sesion {
	
	
	
	
	private int id;
	private double precio;
	private TipoSesion tipo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public TipoSesion getTipo() {
		return tipo;
	}
	public void setTipo(TipoSesion tipo) {
		this.tipo = tipo;
	}
	public Sesion(int id, TipoSesion tipo) {
		super();
		this.id = id;
		this.precio = tipo.getPrecio();
		this.tipo = tipo;
	}
	
	
	
	

}
