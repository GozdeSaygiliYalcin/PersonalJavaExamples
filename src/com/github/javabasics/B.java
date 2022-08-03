package com.github.javabasics;


	public class B implements Runnable {
		   public void run() {
		     System.out.println("B");	
		   }
		
	
	public static void main(String[ ] args) {
		   A object = new A();
		   object.start();
		   }
	}
