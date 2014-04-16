package com.helio.concurrency.threads;

/**
 * join and SimpleThreads Example
 * 
 * 
 * @author lihe
 *
 */

public class part7 {
	
	static void threadMessage(String message){
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n",  threadName, message);
	}
	
	private static class MessageLoop implements Runnable{
		public void run(){
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
					threadMessage(importantInfo[i]);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
	
	public static void main(String args[]) throws InterruptedException{
		long patience = 1000 * 60 * 60;
		
		if(args.length > 0){
			patience = Long.parseLong(args[0]) * 1000;
		}
		
		threadMessage("Starting...");
		long startTime = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start();
		
		threadMessage("Waiting for complete");
		
		while(t.isAlive()){
			threadMessage("Still waiting...");
			
			t.join(1000);
			
			if(((System.currentTimeMillis() - startTime) > patience ) 
					&& t.isAlive()){
				t.interrupt();
				t.join();
			}
		}
		threadMessage("Finally!");
	}
}
