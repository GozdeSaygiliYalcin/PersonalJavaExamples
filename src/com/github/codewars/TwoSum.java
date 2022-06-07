package com.github.codewars;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {

		int [] array1 = {12,4,3,2,5,1};
		int [] array2 = {2,7,11,15};

		twoSum(array1, 16);
		twoSum(array1, 7);
		twoSum(new int[] {2,3,4}, 5);
		
		//System.out.println(Arrays.toString(array1));
		
	}
		
		public static int[] twoSum(int[] numbers, int target)    {
			
			for(int i = 0; i<numbers.length; i++) {
				for (int j = 0; j < i; j++) {
					if(numbers[i] + numbers[j] == target) {
						int[] total = {j,i};
						
						return total;
					
					}
				}	
			}
			return numbers;
			
		}
		

	}


