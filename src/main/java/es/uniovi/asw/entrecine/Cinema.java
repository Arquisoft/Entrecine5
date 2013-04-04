package es.uniovi.asw.entrecine;

public class Cinema {
	
	private int rows;
	private int seatsPerRow;
	private Seat[][] seats;
	
	public Cinema(int rows, int seatsPerRow) {
		this.rows = rows;
		this.seatsPerRow = seatsPerRow;
		seats = new Seat[rows][seatsPerRow];
		for(int i=0; i<seats.length; i++){
			for(int j=0; j<seats[0].length; j++){
				seats[i][j] = new Seat(i+1, j+1);
			}
		}
	}
	
	public Seat getSeat(int row, int number){
		if(row <= rows && number <= seatsPerRow)
			return seats[row][number];
		return null;
	}

}
