package com.github.hackerrank.thirtdayschallenge;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day007Arrays {
	
	public static Integer[] fillArray(int n) { //scanner sınıfı ile array yaratıyoruz
		
		Scanner input = new Scanner(System.in);
	
		Integer [] fillingArray = new Integer [n];
		for (int i = 0; i < n; i++) {
			fillingArray[i] = input.nextInt();
		
		}
		return fillingArray;
    }
	public static void reverseArray(Integer [] anArray) {
		
		Collections.reverse(Arrays.asList(anArray));
        System.out.println(Arrays.asList(anArray));
		
	}
	
	
	public static void main(String[] args) throws RuntimeException, IOException{
		
		//Integer [] arr = {10, 20, 30, 40, 50};
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();	
		Integer[] arr2 = fillArray(n);
		
	       // reverseArray(arr);
	        reverseArray(arr2);
		
	}

}
