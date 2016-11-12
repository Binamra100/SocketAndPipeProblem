package com.binamra.aerialarts.dao;

public class Socket implements Coupling {
	int diameter;

	public Socket(int size){
		this.diameter = size;
	}
	public int getSize() {
		return diameter;
	}

	public void setSize(int size) {
		this.diameter = size;
	}
	
	public String toString(){
		return "Socket " + diameter;
	}
}
