package com.github.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		input.close();
		
		System.out.println("US: " + NumberFormat.getCurrencyInstance(new Locale("en", "US"))
		        .format(amount));
		System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en", "IN"))
		        .format(amount));
		System.out.println("China: " + NumberFormat.getCurrencyInstance(new Locale("zh", "CH"))
		        .format(amount));
		System.out.println("France: " + NumberFormat.getCurrencyInstance(new Locale("fr", "FR"))
		        .format(amount));

	}

}
