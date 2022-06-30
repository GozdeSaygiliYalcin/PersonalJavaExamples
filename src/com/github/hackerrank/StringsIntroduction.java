package com.github.hackerrank;

import java.util.Scanner;

public class StringsIntroduction {

	public static void main(String[] args) {
		String myString = "Hello World!";
		char[] myChar1 = myString.toCharArray();
		String[] arrOfStr = myString.split("[1234567890. ,':_;-]");
		System.out.println(arrOfStr.toString());
		
		String str;
		Scanner input = new Scanner(System.in);
		str = input.nextLine();
		char[] myChar2 = str.toCharArray();
	}

}
