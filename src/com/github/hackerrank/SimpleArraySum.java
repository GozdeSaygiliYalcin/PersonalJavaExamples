package com.github.hackerrank;

import java.util.Iterator;
import java.util.List;

public class SimpleArraySum {

	public static void main(String[] args) {
		
		

	}

	public static int simpleArraySum (List<Integer>ar) {
		int sum = 0;
		for (Integer integer : ar) {
		sum += integer;
		}
		return sum;
		
	}
}
