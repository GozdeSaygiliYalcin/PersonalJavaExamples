package com.github.hackerrank;

import java.util.Scanner;

public class StaticInitializerBlock {
	
	static boolean flag = true;
	static Scanner input = new Scanner(System.in);
	static int B = input.nextInt();
	static int H = input.nextInt();
	
	static {  //  When the class is loaded these code blocks will be executed first.
	    try { 
	        if(B <= 0 || H <= 0){
	            flag = false;
	            throw new Exception("Breadth and height must be positive");
	        }
	    }catch(Exception e){
	        System.out.println(e);
	    }
	}
	public static void main(String[] args) {
		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}

}


