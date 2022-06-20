package com.github.codewars;

public class GrowthOfAPopulation {
	
	
	public static int nbYear(int p0, double percent, int aug, int p) {
        
		int counter = 0;
	
		do {
			
			p0 += (double) ((p0*percent/100) + aug);
			counter++;
			
		} while (p0<p);
			
		return counter;
    }

	public static void main(String[] args) {
		
		nbYear(1500, 5, 100, 5000);
		System.out.println(nbYear(1500, 5, 100, 5000));

	}

}
