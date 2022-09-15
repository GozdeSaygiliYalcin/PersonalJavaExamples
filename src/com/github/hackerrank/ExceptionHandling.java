package com.github.hackerrank;

import java.util.Scanner;

public class ExceptionHandling {
	
	 public static long power(int x, int y) throws Exception{
	        long res;
	        if(x<0 || y<0){
	            throw new Exception("n or p should not be negative.");
	        }
	        if(x==0 && y==0){
	            throw new Exception("n and p should not be zero.");
	        }
	        return res = (long)Math.pow(x,y);
	    }
	    

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input .hasNextInt()) {
	            int n = input .nextInt();
	            int p = input .nextInt();
	           
	            try {
	                System.out.println(power(n, p));
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	    }
}
