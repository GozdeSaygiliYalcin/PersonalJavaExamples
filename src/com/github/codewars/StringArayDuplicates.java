package com.github.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringArayDuplicates {
	
	 public static String[] dup(String[] arr){
		 
		char[] ch = Arrays.stream(arr)
	            .collect(Collectors.joining())
	            .toCharArray();
		char[] result = new char[ch.length];
	   
		for (int i = 0; i < ch.length; i++) {
			for (int k = 0; k < ch.length; k++) {
				if(ch[i] == ch[k]) {
					
				}
			}	
		}
		return arr;			 
	}
	 
	 
	public static void main(String[] args) {
		
		String [] arr = {"gozde", "ali", "veli", "abcd"};
		System.out.println(dup(arr));
		System.out.println(arr.toString());
	}

}
