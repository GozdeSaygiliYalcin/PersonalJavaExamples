package com.github.hackerrank;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
		
		int counter = 0;
		
		Scanner input = new Scanner(System.in);
	
		while(input.hasNext()) {
			counter++;
			System.out.println(counter + " " +input.nextLine());
			
		}
			
		
	}

}
