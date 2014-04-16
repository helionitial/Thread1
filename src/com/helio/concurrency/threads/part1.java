package com.helio.concurrency.threads;

/**
 * defining and starting a thread by provide a Runnable object.
 * @author lihe
 */

public class part1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
	}

	public static void main(String args[]){
		(new Thread(new part1())).start();
	}
	
}
