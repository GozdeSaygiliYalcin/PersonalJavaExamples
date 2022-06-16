package com.github.codewars;

import java.util.Arrays;

public class SumsofParts {
	
	 public static int[] sumParts(int[] ls) {
		 
		 int[] ls2 = new int[ls.length+1];
		 int sum = Arrays.stream(ls).sum();
		 
		 for (int i = 0; i < ls.length; i++) {
			
					ls2[i] = sum;
					sum = sum - ls[i];
					}
		return ls2;	 
	 	}

		public static void main(String[] args) {
		int [] array1 = {3, 7, 12, 43, 54, 43, 28, 3, 19, -24, -19, 3, 3};
		int [] array2 = {3, 4, 5, 2};
		//sumParts(array1);
		sumParts(array2);
		System.out.println(Arrays.toString(sumParts(array2)));
		System.out.println(Arrays.toString(sumParts(array1)));
	}

}
