package com.github.hackerrank;

import java.util.Scanner;

/*
 * You are given an integer , you have to convert it into a string.
Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
 can range between  to  inclusive.
 */

public class IntToString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String s = String.valueOf(n);
		if(s != null) {
			System.out.println("Good job");
		} 
		else {
			System.out.println("Wrong answer");
		}
		
	}

}
