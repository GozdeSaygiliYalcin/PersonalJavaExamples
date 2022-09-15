package com.github.hackerrank.thirtdayschallenge;

import java.util.Scanner;

public class Day006LetsReview {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i =0;i<n;i++) {
            String str = sc.next();
            for(int j =0 ; j<str.length();j+=2) {
            	
               System.out.print(str.charAt(j));
            }
            System.out.print(" ");
            for(int j =1 ; j<str.length();j+=2) {
            	
               System.out.print(str.charAt(j));
            }
            System.out.println();
        }
	}

}
