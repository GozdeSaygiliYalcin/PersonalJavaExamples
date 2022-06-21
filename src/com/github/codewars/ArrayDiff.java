package com.github.codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * The goal in this kata is to implement a difference function, 
 * which subtracts one list from another and returns the result.
 * It should remove all values from list a, 
 * which are present in list b keeping their order.
 */

public class ArrayDiff {
	
	public static int[] arrayDiff1(int[] a, int[] b) { //first solution
		List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
		List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
		listA.removeAll(listB);
		return listA.stream().mapToInt(e -> e).toArray();
	}

	public static int[] arrayDiff2(int[] a, int[] b) { //second solution
		return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
	}

	public static int[] arrayDiff3(int[] a, int[] b) { //third solution
		
		for (int search : b) {
			int index = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] != search) {
					a[index++] = a[i];
				}
			}
			a = Arrays.copyOf(a, index);
		}
		return a;
	}
	
	public static int[] arrayDiff4(int[] a, int[] b) { //fourth solution
        if (a.length == 0) return new int[]{};
        else if (b.length == 0) return a;

        int count = 0;
        int[] result = new int[a.length + b.length];
        boolean skip = false;

        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    skip = true;
                    break;
                }
            }
            if (!skip) {  
                result[count] = i;
                count++;
            } else {
                skip = false;
            }
        }
        return Arrays.copyOf(result, count); //this is creating a new list
    }


	
	public static void main(String[] args) {
	
		System.out.println(Arrays.toString(arrayDiff1(new int [] {1,2,2}, new int[] {2})));
		System.out.println(Arrays.toString(arrayDiff2(new int [] {1,2,2}, new int[] {2})));
		System.out.println(Arrays.toString(arrayDiff3(new int [] {1,2,2}, new int[] {2})));
		System.out.println(Arrays.toString(arrayDiff4(new int [] {1,2,2}, new int[] {2})));
	}
}