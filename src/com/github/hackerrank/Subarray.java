package com.github.hackerrank;

import java.util.Scanner;

public class Subarray {
	
	public static int countArray(int number) {
		
		Scanner input = new Scanner(System.in); // number elemanlı diziyi scanner ile oluşturuyoruz
		number = input.nextInt();
	    int[] n1 = new int[number];
	    for(int i = 0; i < number; i++) {
	        n1[i]=input.nextInt();
	    }
	        input.close();
            
		int sum;
		int countNegative = 0;
		for (int k = 0; k < n1.length; k++) {
			sum = 0;
			for(int j = k; j<n1.length; j++){
                sum += n1[j];
                if(sum < 0){
                	countNegative++;
                }
			}
		}
		return countNegative;
	}
	
	public static void main(String[] args) {
		
		System.out.println(countArray(3));

	}

}



