package com.helio.concurrency.threads;

/**
 * usage of interrupts.
 * 1) it's very common for the thread to terminate.
 * 
 * interrupt status flag?
 * 
 * @author lihe
 *
 */

public class part4 {

	public static void main(String args[]) {
		String importantInfo[] = {
				"Mares eat oats",
				"does eat oats",
				"little lambs eat ivy",
				"a kid will eat ivy too"
		};
		
		for(int i = 0; i < importantInfo.length; i++){
			// pause for 4 sec
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < importantInfo.length; i++){
			if(Thread.interrupted())
				try {
					throw new InterruptedException();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
