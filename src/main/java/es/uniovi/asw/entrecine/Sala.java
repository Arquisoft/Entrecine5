package es.uniovi.asw.entrecine;

public class Sala {

	
	private int id;
	private int numero;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Sala(int id, int numero) {
		super();
		this.id = id;
		this.numero = numero;
	}
	
	
}
