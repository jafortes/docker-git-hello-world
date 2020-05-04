package org.tolearn.docker;

public class HelloWorldPing {
	
	public static void main(String args[]) throws Exception{
		for(int i = 0 ; i < 10; i++){
			System.out.println("Hello World Ping:" + i );
			Thread.sleep(1000);
		}
	}
}
