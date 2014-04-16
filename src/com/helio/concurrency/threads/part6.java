package com.helio.concurrency.threads;

/**
 * Deadlock
 * 
 * bow problem:
 * when you bow to a friend, you must remain bowed until your friend
 * has a chance to return the bow. Unfortunately, this rule does not
 * account for the possibility that two friends might bow to each other 
 * at the same time.
 * @author lihe
 *
 */

public class part6 {
	static class Friend{
		private final String name;
		public Friend(String name){
			this.name = name;
		}
		public String getName(){
			return this.name;
		}
		
		public synchronized void bow(Friend bower){
			
		}
	}
}
