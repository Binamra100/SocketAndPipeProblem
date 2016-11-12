package com.binamra.aerialarts.dao;

public class Socket implements Coupling {
	int diameter;

	public Socket(int size){
		this.diameter = size;
	}
	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int size) {
		this.diameter = size;
	}
	
	public String toString(){
		return "Socket " + diameter;
	}
}
