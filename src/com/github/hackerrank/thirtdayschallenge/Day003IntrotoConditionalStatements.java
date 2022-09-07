package com.github.hackerrank.thirtdayschallenge;

import java.util.Scanner;

public class Day003IntrotoConditionalStatements {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		if(number%2 != 0) 
			System.out.println("Weird");
		if(number%2 == 0 && number < 5 && number > 2)
			System.out.println("Not Weird");
		if(number%2 == 0 && number <= 20 && number >= 6)
			System.out.println("Weird");
		if(number%2 == 0 && number > 20 && number <= 100)
			System.out.println("Not Weird");
		input.close();

	}

}
