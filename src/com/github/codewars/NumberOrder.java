package com.github.codewars;

public class NumberOrder {
	
	public static boolean isAscOrder(int[] arr) {
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j] ) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		
		System.out.println(isAscOrder(new int[]{1,2,4,7,19}));
		System.out.println(isAscOrder(new int[]{9,8,7,6,5,4,3,2,1}));
		System.out.println(isAscOrder(new int[]{1,6,10,18,2,4,20}));
	}

}
