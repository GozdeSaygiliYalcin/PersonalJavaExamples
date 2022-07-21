package com.github.udemy;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// Girilen sayının asal olup olmadığını bulan metot
		
		PrimeNumber pn = new PrimeNumber();
		System.out.print("please enter a positive number: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(pn.isPrime(n));
		input.close();
		
	}

	public boolean isPrime(int n) {
		boolean prime = true;
		
		for(int i = 2; i < n; i++) {
			if(n%i == 0) {
				prime = false;
				System.out.println(n + " is not a prime number");
				break;
			}
		}
		System.out.println(n + " is a prime number");
		return prime;
	}
}
