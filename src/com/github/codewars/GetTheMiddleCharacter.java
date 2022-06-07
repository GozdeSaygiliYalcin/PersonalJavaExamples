package com.github.codewars;

public class GetTheMiddleCharacter {
	
	public static String getMiddle(String word) {
		
		int length;
		int position;
			
		if(word.length()%2 == 0) {
			
			position = word.length() / 2 - 1;
			length = 2;
		
		} 
		else {
			position = word.length() / 2;
			length = 1;
		}
	
		return word.substring(position, position + length); //substring methodu kelimenin önü ve arkasındaki harfleri siliyor
	}
	public static void main(String[] args) {
		
		GetTheMiddleCharacter newWord = new GetTheMiddleCharacter();
		
		System.out.println(newWord.getMiddle("asbc"));

	}

}
