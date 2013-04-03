package es.uniovi.asw.entrecine;

public class ButacaOcupada {

	
	private HorarioPelicula horarioPelicula;
	private int fila_butaca;
	private int columna_butaca;
	private int id;
	private Sala sala;
	
	
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public HorarioPelicula getHorarioPelicula() {
		return horarioPelicula;
	}
	public void setHorarioPelicula(HorarioPelicula horarioPelicula) {
		this.horarioPelicula = horarioPelicula;
	}
	public int getFila_butaca() {
		return fila_butaca;
	}
	public void setFila_butaca(int fila_butaca) {
		this.fila_butaca = fila_butaca;
	}
	public int getColumna_butaca() {
		return columna_butaca;
	}
	public void setColumna_butaca(int columna_butaca) {
		this.columna_butaca = columna_butaca;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ButacaOcupada(HorarioPelicula horarioPelicula, int fila_butaca,
			int columna_butaca, int id, Sala sala) {
		super();
		this.horarioPelicula = horarioPelicula;
		this.fila_butaca = fila_butaca;
		this.columna_butaca = columna_butaca;
		this.id = id;
		this.sala = sala;
	}
	
	
	
	
}
