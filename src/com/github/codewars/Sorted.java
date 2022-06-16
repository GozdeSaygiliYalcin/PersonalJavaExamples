package com.github.codewars;


public class Sorted {
	
	 public static String isSortedAndHow(int[] array) {
	
		 	boolean asc = true;
		 	boolean dsc = true;
		 	
		 for(int i = 0; i < array.length-1; i++) {
			 	
				if(array[i] <= array[i+1]) {
					dsc = false;
				}
				else if(array[i] >= array[i+1]) {
					asc = false;
				}
		}
		if(asc == true) {
			return "yes, ascending";
		}
		else if(dsc == true) {
			return "yes, descending";
		}
		return "no";
	 }

	public static void main(String[] args) {
		
		int[] array = new int[] {2, 4, 30};
		System.out.println(isSortedAndHow(array));
		
		int [] array2 = {3, 7, 12, 43, 54, 43, 28, 3, 19, -24, -19};
		System.out.println(isSortedAndHow(array2));
	
	}

}
