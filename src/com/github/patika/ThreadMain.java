package com.github.patika;

public class ThreadMain {

	public static void main(String[] args) {
		

		ThreadExample t1 = new ThreadExample();
		ThreadExample t2 = new ThreadExample();
		
		t1.run();
		t1.start();
		t2.start();

	}

}
