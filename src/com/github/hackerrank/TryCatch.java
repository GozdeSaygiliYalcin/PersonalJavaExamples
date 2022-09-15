package com.github.hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        try {
	            int x = input.nextInt();
	            int y = input.nextInt();
	            System.out.println(x/y);
	        } catch (ArithmeticException e) {
	            System.out.println(e);
	        } catch (InputMismatchException e) {
	            System.out.println(e.getClass().getName());
	        }
	    }

}
