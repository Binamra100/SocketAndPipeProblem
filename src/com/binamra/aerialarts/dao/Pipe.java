package com.binamra.aerialarts.dao;

public class Pipe implements Coupling {
	int diameter;
	
	public Pipe(int size){
		this.diameter = size;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int size) {
		this.diameter = size;
	}
	
	public String toString(){
		
		return "Pipe " + diameter;
		
	}
	
}
