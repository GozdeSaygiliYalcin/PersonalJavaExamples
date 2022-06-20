package com.github.hackerrank;

import java.util.List;
import java.util.Scanner;

public class AVeryBigSum {
	
	public static long aVeryBigSum(List<Long> ar) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long maxNumber = Long.MAX_VALUE;
		long minNumber = Long.MIN_VALUE;
		long numberCalculate;
		numberCalculate = input.nextLong();
		
		for (int i = 0; i <= n; i++) {
			if(numberCalculate < maxNumber && numberCalculate > minNumber) {
				numberCalculate = numberCalculate+i;
				System.out.println(numberCalculate);
			}
		}
		return 0;
	    }

	public static void main(String[] args) {
		List<Long> ar;
		
		
	}

}
