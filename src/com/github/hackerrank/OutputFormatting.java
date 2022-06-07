package com.github.hackerrank;

import java.util.Locale;
import java.util.Scanner;

public class OutputFormatting {

	public static void main(String[] args) {
//		
//		System.out.printf ("'%-10s' %n", "Hello"); //'Hello     '
//		System.out.printf("'%3.5s'", "Hello World!"); //'   Hello'
//		System.out.printf("%f%n", 3.1423); // output 3.142300
//		System.out.printf(Locale.US, "%,d %n", 12300); //12,300
//		System.out.printf(Locale.ITALY, "%,d %n", 10000); //10.000
//		
		Scanner input=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=input.next();
            int x=input.nextInt();
            System.out.printf("%-15s %03d\n", s1, x);
        }
        System.out.println("================================");

	}

}
