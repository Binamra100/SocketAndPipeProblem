package com.binamra.aerialarts;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;
import com.binamra.aerialarts.dao.Pipe;
import com.binamra.aerialarts.dao.Socket;

public class Solution {

	public static void main(String[] args) {
		
		int num;
		ArrayList<Pipe> pipes = new ArrayList<Pipe>();
		Hashtable<Integer, Socket> sockets = new Hashtable<Integer, Socket>();
		
		Random rand = new Random();
		
		//for one to one mapping
		for(int i=0;i<=10;i++){
			num = rand.nextInt(20 - 0) + 0;
			pipes.add(new Pipe(num));
			sockets.put(num,new Socket(num));
		}
		
		// searching for the appropriate match between socket and pipe.
		for(Pipe p: pipes){
			if(sockets.containsKey(p.getSize())){
				System.out.println(p + " matches " + sockets.get(p.getSize()));
			}
		}
		
		
		

	}

}