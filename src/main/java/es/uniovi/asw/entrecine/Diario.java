package es.uniovi.asw.entrecine;

public class Diario implements TipoSesion{

	
	private double precio;
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}
	public Diario(double precio) {
		super();
		this.precio = precio;
	}

}
