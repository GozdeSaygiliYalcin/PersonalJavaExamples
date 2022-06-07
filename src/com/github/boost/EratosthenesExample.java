package com.github.boost;

import java.util.Scanner;
//This is an example about Eratosthenes method which can calculate prime numbers. 

public class EratosthenesExample {
	
	static int endNumber;
	
	void PrimeNumberEratos(int endNumber) {
		
		boolean[]isPrime = new boolean[endNumber+1];
		
			for (int counter1 = 0; counter1 <= endNumber; counter1++) {
				isPrime[counter1]=true;
				}
			
			for (int counter2 = 2; counter2*counter2 < endNumber; counter2++) {
				if(isPrime[counter2]==true) {
					
					for (int counter3 = counter2*counter2; counter3 <= endNumber; counter3=counter3+counter2) {
						isPrime[counter3]=false;
					}
				}
			}
	
			for (int counter = 2; counter <= endNumber; counter++) {
					if(isPrime[counter]==true) {
						System.out.print(counter + " ");
						}
				}
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			System.out.print("Please enter an ending number for the list: ");
			endNumber = input.nextInt();
			input.close();
		
		EratosthenesExample prime =new EratosthenesExample();
			prime.PrimeNumberEratos(endNumber);
			System.out.println(" :prime numbers are printed" );	
	}

}
