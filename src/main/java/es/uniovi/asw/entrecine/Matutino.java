package es.uniovi.asw.entrecine;

public class Matutino implements TipoSesion{

	
	private double precio;
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}
	public Matutino(double precio) {
		super();
		this.precio = precio;
	}

}
