package com.github.codewars;

import java.util.Iterator;

public class BumpsintheRoad {

	public static void main(String[] args) {
		
		BumpsintheRoad bump = new BumpsintheRoad();
		
		System.out.println(BumpsintheRoad.bumps("_ __ ___n_ __n_"));
		System.out.println(BumpsintheRoad.bumps	("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"));
		
		
		
	}
		public static String bumps(final String road) {
		   
			int  counterFlat = 0;
			int counterBump = 0;
			
			char[] arr = road.toCharArray();
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i] =='n') {
					counterFlat++;
	
				}
				if(arr[i] == '_') {
					counterBump++;	
			}
				
				System.out.println(counterFlat+counterBump);
	
			}
			if(counterFlat <= 15) 
			{
				return "Woohoo!";
			}
				return "Car Dead";
		}
}