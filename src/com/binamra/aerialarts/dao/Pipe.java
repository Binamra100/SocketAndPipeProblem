package com.binamra.aerialarts.dao;

public class Pipe implements Coupling {
	int size;
	
	public Pipe(int size){
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public String toString(){
		
		return "Pipe " + size;
		
	}
	
}
