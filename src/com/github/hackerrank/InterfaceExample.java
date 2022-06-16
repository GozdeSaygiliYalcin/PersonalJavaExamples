package com.github.hackerrank;

import java.util.Scanner;

public class InterfaceExample {
	
	public interface AdvancedArithmetic {
		
		public int divisorSum(int n);
	}
	
	static class MyCalculator implements AdvancedArithmetic {
		
		int sum = 0;
		
		public int divisorSum(int n) {
				      
			for (int i = 1; i <= n; i++) {
				if(n % i == 0) {
				 sum = sum+i;
				}
			}
			return sum;
        }
	}

	public static void main(String[] args) {
	
		int askNumber;
		Scanner input = new Scanner(System.in);
		askNumber = input.nextInt();
		
		MyCalculator n1 = new MyCalculator();
		
		System.out.println("I implemented: AdvancedArithmetic");
		System.out.println(n1.divisorSum(askNumber));
   
	}

}
