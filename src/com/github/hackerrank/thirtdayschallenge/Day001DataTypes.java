package com.github.hackerrank.thirtdayschallenge;

import java.util.Scanner;

public class Day001DataTypes {

	public static void main(String[] args) {
		
		int number1 = 4;
	    double double1 = 4.0;
	    String str = "HackerRank";
		
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		double d = input.nextDouble();
		input.nextLine();
		String s = input.nextLine();
		
		System.out.println(number1+i);
		System.out.println(double1+d);
		System.out.println(str+ " "+ s);
		
		input.close();

	}

}
