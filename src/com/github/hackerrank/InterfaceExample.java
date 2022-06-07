package com.github.hackerrank;

import java.util.Iterator;
import java.util.Scanner;

public class InterfaceExample {
	
	public interface AdvancedArithmetic {
		
		public int divisorSum(int n);
	}
	
	class MyCalculator implements AdvancedArithmetic {
		
		static int sum = 0;
		static int askNumber;
		
		public int divisorSum(int n) {
				       
			Scanner input = new Scanner(System.in);
			askNumber = input.nextInt();
			
			for (int i = 0; i <= askNumber; i++) {
				if(askNumber % i == 0) {
				 sum = sum+i;
				}
			}
			return sum;
        }
	}

	public static void main(String[] args) {
	
//      MyCalculator n1 = new MyCalculator();
//      n1.divisorSum(askNumber);
//    
		
				

	}

}
