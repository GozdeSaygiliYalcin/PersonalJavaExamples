package com.github.hackerrank;

import java.util.Scanner;

public class Loops1 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			if(N <= 20 && N >= 2) {
				int multiply = N * i ;
				System.out.println(N + " x " + i + " = " + multiply);
		
			}
			input.close();
		}
	}
}

