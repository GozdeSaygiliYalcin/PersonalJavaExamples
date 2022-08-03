package com.github.javabasics;

	
	public class A extends Thread {
		   public void run() {
		    System.out.println("A");
		    Thread t = new Thread(new B());
		    t.start();
		   }
		}

