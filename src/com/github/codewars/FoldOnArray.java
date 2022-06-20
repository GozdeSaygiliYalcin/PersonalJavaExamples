package com.github.codewars;

import java.util.Arrays;



public class FoldOnArray {
	
	
	public static int[] foldArray(int[] array, int runs) {
		
		int[] tempArr = Arrays.copyOf(array, array.length);
		int length = tempArr.length;
		
		if (length %2 != 0) {
			length++;
		}
		int[]finalArr = Arrays.copyOf(tempArr, length/2);
		for (int j = 0; j < length / 2; j++) {
			
			if(j != tempArr.length-1-j) {	
			finalArr[j] = array[j] + array[array.length-j-1];
			}
			else {
				finalArr[j] = array[j];
					}
				}
					System.out.println(Arrays.toString(finalArr));
				if (runs != 1) {
					return foldArray(finalArr, --runs);
				} else if(finalArr.length == 1){
					return finalArr;
				
				}
				return finalArr;
	  }

	public static void main(String[] args) {
		
		//finalArr.length == runCalc|runs == 1 ? finalArr : foldArray(finalArr,--runs)
		
		int[] array2 = {4,5,6,7,8,9}; // {13, 13, 13 } //2. { 26, 13 }
		foldArray(array2, 2);
		
		int[] array3 = { -9, 9, -8, 8, 66, 23 };
		foldArray(array3, 5);
	}

}
