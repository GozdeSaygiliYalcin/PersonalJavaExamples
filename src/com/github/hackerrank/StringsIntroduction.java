package com.github.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class StringsIntroduction {

	public static void main(String[] args) {
		
		String myString = "He1l1loo Wo3rld12!";
		char[] myChar1 = myString.toCharArray();
		String[] arrOfStr = myString.split("[1234567890. ,':_;-]");
		System.out.println(Arrays.toString(arrOfStr));
		
//		String str;
//		Scanner input = new Scanner(System.in);
//		str = input.nextLine();
//		char[] myChar2 = str.toCharArray();
	}

}
