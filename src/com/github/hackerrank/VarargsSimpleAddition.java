package com.github.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VarargsSimpleAddition {

	public static void main(String[] args) {
		int n1, n2, n3, n4, n5, n6;
		
		Scanner input = new Scanner(System.in);
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		n4 = input.nextInt();
		n5 = input.nextInt();
		n6 = input.nextInt();
		
//		List<Integer> numberList = new ArrayList<Integer>(); // bu kısımda sadece array list yapma örneği var.
//		numberList.add(n1);
//		numberList.add(n2);
//		numberList.add(n3);
//		numberList.add(n4);
//		numberList.add(n5);
//		numberList.add(n6);
		
		System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
		System.out.println(n1 + "+" + n2 +"+" + n3 +"=" + (n1+n2+n3));
		System.out.println(n1 + "+" + n2 + "+" + n3 + "+" + n4 + "+" + n5 + "=" + (n1+n2+n3+n4+n5));
		System.out.println(n1 + "+" + n2 + "+" + n3 + "+" + n4 + "+" + n5 + "+" + n6 + "=" + (n1+n2+n3+n4+n5+n6));
		

	}

}
