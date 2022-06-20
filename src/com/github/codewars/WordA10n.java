package com.github.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

//The word i18n is a common abbreviation of internationalization in the developer community,
//used instead of typing the whole word and trying to spell it correctly. Similarly,
//a11y is an abbreviation of accessibility.
//
//Write a function that takes a string and turns any and all "words" (see below) within that string of length 4
//or greater into an abbreviation, following these rules:
//
//A "word" is a sequence of alphabetical characters. By this definition, any other character like a space
//or hyphen (eg. "elephant-ride") will split up a series of letters into two words (eg. "elephant" and "ride").
//The abbreviated version of the word should have the first letter, then the number of removed characters,
//then the last letter (eg. "elephant ride" => "e6t r2e").

public class WordA10n {
	
	 public String abbreviate(String string) { //method 1 - my solution
		  
		    String[] arrOfStr = string.split("[1234567890. ,':_;-]");
		    for (String a : arrOfStr) {		        
		        if (a.length() > 3 ) {
		        	string = string.replaceFirst(a, a.charAt(0) + "" + (a.length()-2) + "" + a.charAt(a.length()-1 )); 
		        } 	
		    }
		    return string;
	}
	 
	 public static String abbreviate2(String string) { //alternative solution

	        System.out.println(string);

	        String[] words = string.replaceAll("-", " - ")
	                .replaceAll(",", " ,")
	                .replaceAll("_", " _ ")
	                .replaceAll("5", " ` ")
	                .replaceAll(";", " ;")
	                .replaceAll("'", " ' ")
	                .replaceAll(":", " :")
	                .replaceAll("\\.", " \\.")
	                .replaceAll("!", " !").split(" ");

	        for (int i = 0; i < words.length; i++) {
	            if (words[i].length() > 3) {
	                words[i] = String.valueOf(String.valueOf(words[i].charAt(0)) + String.valueOf(words[i].length() - 2) + String.valueOf(words[i].charAt(words[i].length() - 1)));
	            }
	        }

	        string = String.join(" ", words);

	        String[] chars = string.split("");

	        for (int i = 0; i < chars.length; i++) {
	            if (chars[i].equals("-") || chars[i].equals("_") || chars[i].equals("'") || chars[i].equals("`")) {
	                chars[i-1] = "@";
	                chars[i+1] = "@";
	            }
	            if (chars[i].equals("!") || chars[i].equals(";") || chars[i].equals(",") || chars[i].equals(".") ||
	                chars[i].equals(":")) {
	                chars[i-1] = "@";
	            }
	        }

	        return String.join("", chars).replaceAll("@", "").replaceAll("`", "5");
	 }

	public static void main(String[] args) {
		WordA10n abr = new WordA10n ();
		//System.out.print(abr.abbreviate2("internationalization-yasadaj-zb"));
		System.out.println(abr.abbreviate("internationalization-yasadaj-zb"));

	}

}
