package com.binamra.aerialarts.dao;

/*
 * This class contains methods that operate on
 * or return diameter of the Socket.
 */
public class Socket implements Coupling {
	private int diameter; // diameter of a socket.

	/*
	 * Constructor method.
	 * Creates a socket object with assigned diameter.
	 */
	public Socket(int diameter){
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
	public void setDiameter(int size) {
		this.diameter = size;
	}
	
	public String toString(){
		return "Socket With diameter(" + diameter + ")";
	}
}
