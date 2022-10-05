package com.github.preperation;

public class CheckEquals {

	public static void main(String[] args) {
		
		String string1 = new String("Geeks");
		String string2 = new String("Geeks");
		
		if(string1 == string2) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		if(string1.equals(string2)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

	}
}
