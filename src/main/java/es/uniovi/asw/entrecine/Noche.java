package es.uniovi.asw.entrecine;

public class Noche implements TipoSesion{

	
	private double precio;
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}
	public Noche(double precio) {
		super();
		this.precio = precio;
	}
	
	

}
