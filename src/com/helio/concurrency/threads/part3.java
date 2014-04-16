package com.helio.concurrency.threads;

/**
 * pausing execution with sleep
 * 1) cannot assume that invoking sleep will suspend the thread for 
 *    precisely the time period specified.
 * 2)
 * @author lihe
 *
 */

public class part3 {
	public static void main(String args[]) throws InterruptedException{
		String importantInfo[] = {
				"Mares eat oats",
				"does eat oats",
				"little lambs eat ivy",
				"a kid will eat ivy too"
		};
		
		for(int i = 0; i < importantInfo.length; i++){
			// pause for 4 sec
			Thread.sleep(4000);
			
		}
	}
}
