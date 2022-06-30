package com.github.hackerrank;


import java.util.Scanner;

public class Java1DArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    int number = input.nextInt();
	    int[] n1 = new int[number];
	    for(int i = 0; i < number; i++){
	        n1[i]=input.nextInt();
	    }

	        input.close();

	        // Prints each sequential element in array a
	        for (int i = 0; i < n1.length; i++) {
	            System.out.println(n1[i]);
	        }
	    }
}

