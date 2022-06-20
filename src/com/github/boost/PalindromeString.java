package com.github.boost;

public class PalindromeString {
	
	public static boolean isPalindrome(String input) {
		
	
		boolean isPalindrome = false;
		char [] PalindromeCand = input.toCharArray();
		for (int j = 0; j < input.length(); j++) {
			if (PalindromeCand[j] == PalindromeCand[input.length()-1])   {
			System.out.println("palindrome");
			return true;
		} else if (PalindromeCand[j] != PalindromeCand[input.length()-1]) {
				isPalindrome = false;
				System.out.println("not palindrome");
				return false;
		}
	}
		return isPalindrome;
	}
	
	public static void main(String[] args) {
		
		String s1 = "dkhfkjsfs";
		String s2 = "ababa";
		
		isPalindrome(s1);
		isPalindrome(s2);
		
//		boolean isPalindrome = false;
//		char [] PalindromeCand = input.toCharArray();
//		for (int j = 0; j < input.length(); j++) {
//			if (PalindromeCand[j] == PalindromeCand[input.length()-1])   {
//				isPalindrome = true;
//		} else if (PalindromeCand[j] != PalindromeCand[input.length()-1]) {
//				isPalindrome = false;
//		}
//			}
//		if(!isPalindrome) {
//			System.out.println("palindrome");
//		} else {
//			System.out.println("not palindrome");
//		}
//	}

}
}