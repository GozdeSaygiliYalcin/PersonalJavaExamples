package com.github.hackerrank.thirtdayschallenge;

import java.util.Scanner;


public class Day004Person { 
	private int age;

	
	public Day004Person(int initialAge) {
	    // Add some more code to run some checks on initialAge
	      if (initialAge<0){
	          age = 0;
	          System.out.println("Age is not valid, setting age to 0.");   
	      }else{
	          this.age= initialAge; 
	      } 
	}

	public void amIOld() {
	    // Write code determining if this person's age is old and print the correct statement:

	      if(age<13){
	          System.out.println("You are young.");
	      }
	       if(age>=13 && age<18){
	          System.out.println("You are a teenager.");
	      }
	      if(age>=18){
	          System.out.println("You are old.");
	      }

	}

	public void yearPasses() {
	    // Increment this person's age.
	      age++;

	}
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    for (int i = 0; i < T; i++) {
	        int age = sc.nextInt();
	        Day004Person p = new Day004Person(age);
	        p.amIOld();
	        for (int j = 0; j < 3; j++) {
	            p.yearPasses();
	        }
	        p.amIOld();
	        System.out.println();
	    }
	    sc.close();

	}

}
