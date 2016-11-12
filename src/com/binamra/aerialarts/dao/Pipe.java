package com.binamra.aerialarts.dao;

public class Pipe implements Coupling {
	int diameter;
	
	public Pipe(int size){
		this.diameter = size;
	}

	public int getSize() {
		return diameter;
	}

	public void setSize(int size) {
		this.diameter = size;
	}
	
	public String toString(){
		
		return "Pipe " + diameter;
		
	}
	
}
