package com.github.coderbyte;

public class ArrayHarmonicAvarage {

	public static void main(String[] args) {
		// This is an example that can calculate harmonical avarage for array.
	
			int [] list = {1,2,3,4,5,6,7,8,9,10}; 
			
			double sumHarm = 0;
			for(double i=1; i<list.length; i++) {
				sumHarm=sumHarm+1/i;
			}
			double avarage = (list.length)/sumHarm;
			System.out.println("Harmonic avarage is: " + avarage);

	}

}
