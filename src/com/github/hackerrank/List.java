package com.github.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class List {
	
	public static void insert(ArrayList<Integer> arr) {
		
		Scanner input = new Scanner(System.in);
		int index;
		int element;
		index = input.nextInt();
		element = input.nextInt();
		
		arr.add(index, element);
				
		System.out.println(Arrays.asList(arr));	
			
		}
	
	public static void delete(ArrayList<Integer> arr) {
		
		Scanner input = new Scanner(System.in);
		int index;
		index = input.nextInt();

		arr.remove(index);

	}

	public static void main(String[] args) {
	
	ArrayList<Integer> arr2 = new ArrayList<>();
	arr2.add(34); arr2.add(36); arr2.add(12); 
	
	insert(arr2);

	}

}
