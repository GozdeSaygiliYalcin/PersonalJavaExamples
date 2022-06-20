package com.github.hackerrank;

import java.util.Scanner;

/*
 Given a string, , and two indices,  
 and , print a substring consisting of 
 all characters 
 in the inclusive range from to . 
 You'll find the String class' 
 substring method helpful 
 in completing this challenge.
 */

public class Substring {

	public static void main(String[] args) {
		
	//String str = "helloooooo";

	String s;
	int start;
	int end;
	
	Scanner askString = new Scanner(System.in);
	s = askString.nextLine();
	Scanner askSNumber = new Scanner(System.in);
	start = askSNumber.nextInt();
	end = askSNumber.nextInt();
	
	System.out.println(s.substring(start, end));
	
	askSNumber.close();
	askString.close();
	}

}
