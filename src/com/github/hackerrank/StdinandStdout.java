package com.github.hackerrank;

import java.util.Scanner;

public class StdinandStdout {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		int number1 = input.nextInt();
//		int number2 = input.nextInt();
//		int number3 = input.nextInt();
//		
//		input.close();
//
//		System.out.println(number1);
//		System.out.println(number2);
//		System.out.println(number3);
		
		//Stdinandout-2
		int number;
		double dbl;
		String word;
		
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		dbl = input.nextDouble();
		input.nextLine();
		word = input.nextLine();
		
		System.out.println("String: " +word);
		System.out.println("Double: " +dbl);
		System.out.println("Int: " + number);
		input.close();
		
	}

}
