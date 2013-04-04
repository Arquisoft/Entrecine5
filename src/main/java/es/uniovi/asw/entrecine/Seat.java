package es.uniovi.asw.entrecine;

public class Seat {
	
	private int row;
	private int number;
	//variable que es 1 si esta ocupado el asiento o 0 si no lo esta
	private int isBusy;
	
	public Seat(int row, int number) {
		this.row = row;
		this.number = number;
		this.isBusy = 0;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getIsBusy(){
		return isBusy;
	}

}
