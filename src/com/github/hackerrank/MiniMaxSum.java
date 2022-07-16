package com.github.hackerrank;

public class MiniMaxSum {
	
	public static void miniMaxSum(int[] arr) {
		
		int sumMin = 0;
		int sumMax = 0;
		int sum = 0;
		
		
		for (int i = 1; i < arr.length; i++) {
			sum = sum+arr[i];
			sumMax = sum-arr[i];
		
			if (arr[i] < sumMin) {
				sumMin = arr[i];
			}
			if (arr[i] > sumMax) {
				sumMax = arr[i];
			}
		}
		System.out.print((sum - sumMax) + " " + (sum - sumMin));
		
	}

	public static void main(String[] args) {
		
		int [] array1 = {3, 7, 12, 43, 54, 43, 28, 3, 19, -24, -19, 3, 3};
		int [] array2 = {3, 4, 5, 2};
		//sumParts(array1);
		
		
		miniMaxSum(array2);
		miniMaxSum(array1);
	}

}
