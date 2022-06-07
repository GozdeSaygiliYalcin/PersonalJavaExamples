package com.github.patika;

public class ThreadExample extends Thread {

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()); 
		
		for (int i = 0; i < 1000; i++) {
			
		}
		
	}
	
	

}
