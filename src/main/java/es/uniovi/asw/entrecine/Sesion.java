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
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public TipoSesion getTipo() {
		return tipo;
	}
	public void setTipo(TipoSesion tipo) {
		this.tipo = tipo;
	}
	public Sesion(int id, double precio, TipoSesion tipo) {
		super();
		this.id = id;
		this.precio = precio;
		this.tipo = tipo;
	}
	
	
	
	

}
