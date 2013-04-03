package main.java.es.uniovi.asw.entrecine;

public class Seat {
	
	private int row;
	private int number;
	private boolean isBusy;
	
	public Seat(int row, int number) {
		this.row = row;
		this.number = number;
		this.isBusy = false;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getNumber() {
		return number;
	}
	
	public boolean getIsBusy(){
		return isBusy;
	}

}
