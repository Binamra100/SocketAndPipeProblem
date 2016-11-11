package com.binamra.aerialarts.dao;

public class Socket implements Coupling {
	int size;

	public Socket(int size){
		this.size = size;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public String toString(){
		return "Socket " + size;
	}
}
