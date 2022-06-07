package com.github.hackerrank;

import java.util.Scanner;

public class AbstractExample {
	
	static abstract class Book{
	    String title;
	    abstract void setTitle(String s);
	    String getTitle(){
	        return title;
	    }
	}
	
	static class MyBook extends Book {

		@Override
		void setTitle(String s) {
			System.out.println("The title is: " + s);
		}
		
	}
	
	public static void main(String[] args) {
		
		MyBook myBook = new MyBook();
		Scanner input = new Scanner(System.in);
		String book = input.nextLine();
		myBook.setTitle(book);
	
	}
}
