package com.github.codewars;

public class ExesAndOhs {
	
	  public static boolean getXO (String str) {
		int  counterX = 0;
		int counterO = 0;
		
		String str2 = str.toLowerCase();
		char[] arr = str2.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] =='x') {
				counterX++;
			}
			if(arr[i] == 'o') {
				counterO++;	
			}
		}
		return counterX == counterO;
	  }
		
	public static void main(String[] args) {
		
		ExesAndOhs xo = new ExesAndOhs();
		//xo.getXO("xore");
		System.out.println(xo.getXO("xOoxxo"));
		
	}

}
