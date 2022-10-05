package com.github.preperation;

import java.util.Scanner;

public class RepeatedCharacters {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		
		int count;  
		
		char [] duplicate = s1.toCharArray();  
		
		for(int i = 0; i< s1.length(); i++) {
			count = 1;
			for(int j = i+1; j < s1.length(); j++) {
				
				 if(duplicate[i] == duplicate[j] /*&& duplicate[i] != ' '*/) {  
	                 count++;  
	                 duplicate[j] = '0';  
				 }
			}
			 if(count > 1 && duplicate[i] != '0')  
	                System.out.println(duplicate[i]);  

		}
	}
}