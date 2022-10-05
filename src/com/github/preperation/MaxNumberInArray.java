package com.github.preperation;

import java.util.Arrays;

public class MaxNumberInArray {
	
	public static int findMaxWithMethod(int [] anArray) {
		int max;
		Arrays.sort(anArray);
		max = anArray[anArray.length-1];

		System.out.println("the maximum number is " + max);
		return max;
		
	}
	
	public static int findMaxWithoutMethod(int [] anArray) {
		int max = 0;
		
		for(int i = 0; i < anArray.length; i++) {
			if(max < anArray[i]) {
			max = anArray[i];
			}
		}
			System.out.println("Maximum value in the array is: "+max);
			return max;
			
	}
		
	public static void main(String[] args) {
		
		int [] arrayN = {2,3,6,12,5,7};
		
		findMaxWithMethod(arrayN);
		findMaxWithoutMethod(arrayN);
	}

}
