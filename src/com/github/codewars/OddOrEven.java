package com.github.codewars;

public class OddOrEven {
	
	public static String oddOrEven (int[] array) {
		
		int sum = 0;
	
		for (int i = 0; i < array.length; i++) {
			
			sum = sum + array[i];
		}
			if(sum % 2 == 0) {
				return "even";	
			} 
			else if (sum % 2 != 0) {
				return "odd";
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		
		
		
		System.out.println(oddOrEven(new int[] {2, 5, 34, 6}));
		System.out.println(oddOrEven(new int[] {2, 5, 34, 5}));
		System.out.println(oddOrEven(new int[] {0, 0, 0, 0}));
		
		

	}

}
