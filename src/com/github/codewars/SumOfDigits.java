package com.github.codewars;

public class SumOfDigits {
	
	public static int digital_root(int n) {
		
		if(n >= 10){
            int sum = n%10 + digital_root(n/10);
            if(sum >= 10){
                return digital_root(sum);
            }else{
                return sum;
            }
        }else{
            return n;
        }       
	}

	public static void main(String[] args) {
		
		System.out.println(digital_root(56));
		System.out.println(digital_root(586));


	}

}
