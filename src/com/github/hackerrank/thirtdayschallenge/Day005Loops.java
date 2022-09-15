package com.github.hackerrank.thirtdayschallenge;


public class Day005Loops {
	
	public static void multiply(int n) {
		
		for (int i = n; i <= n; i++) {
			for (int j = 1; j <= 10; j++) {
				int sum = i*j;
				System.out.println(i + " x " + j + " = " + sum);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		multiply(3);
	}

}
