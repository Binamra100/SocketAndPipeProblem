package com.binamra.aerialarts;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;
import com.binamra.aerialarts.dao.Pipe;
import com.binamra.aerialarts.dao.Socket;

public class Solution {

	public static void main(String[] args) {

		int diameter; //random diameter to pipes and socket
		ArrayList<Pipe> pipes = new ArrayList<Pipe>();//contains all the pipe object 
		Hashtable<Integer, Socket> sockets = new Hashtable<Integer, Socket>(); // contains all the socket object with key as diameter
		Random rand = new Random();// to generate random diameter for both pipes and sockets

		/*
		 Since there is one on one mapping between pipes and sockets,
		 the same diameter is used for both socket and pipe.
		 Random 10 diameter is generated and assigned to both socket and pipe.
		 */
		
		for(int i=0;i<=10;i++){
			diameter = rand.nextInt(20 - 0) + 0;
			pipes.add(new Pipe(diameter));
			sockets.put(diameter,new Socket(diameter));
		}

		/*
		 Matching the socket and pipe with the same diameter.
		 */

		for(Pipe p: pipes){
			if(sockets.containsKey(p.getDiameter())){
				System.out.println(p + " matches " + sockets.get(p.getDiameter()));
			}
		}
	}
}
