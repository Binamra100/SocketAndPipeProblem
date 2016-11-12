package com.binamra.aerialarts.dao;

/*
 * This class contains methods that operate on
 * or return diameter of the pipe.
 */
public class Pipe implements Coupling {
	private int diameter;// diameter of a pipe.
	
	/*
	 * Constructor method
	 * Creates a pipe object with assigned diameter.
	 */
	
	public Pipe(int diameter){
		this.diameter = diameter;
	}

	/*
	 * @see com.binamra.aerialarts.dao.Coupling#getDiameter()
	 */
	public int getDiameter() {
		return diameter;
	}

	/*
	 * @see com.binamra.aerialarts.dao.Coupling#setDiameter(int)
	 */
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	
	public String toString(){
		return "Pipe With diameter(" + diameter + ")";
	}
}
