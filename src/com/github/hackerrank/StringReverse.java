package com.github.hackerrank;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// Given a string A, print Yes if it is a palindrome, print No otherwise.
		
		 Scanner sc=new Scanner(System.in);
	     String A=sc.next();
	     String B = new StringBuilder(A).reverse().toString();
	     System.out.println(B);
	     if(A.equals(B)) 
	    	 System.out.println("Yes");
	     else
	    	 System.out.println("No");


	}

}
