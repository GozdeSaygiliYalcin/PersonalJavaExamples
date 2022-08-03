package com.github.boost;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciGetIndex {
	
private static int fibo(int n) { //recursive metod ile fibonacci elemanlarını buluyor
		
        if(n == 0 || n == 1) return 1;
        
        return fibo(n - 1) + fibo(n - 2);
    } 

public static List<Integer> fibonacci(int n, List<Integer> fiboArray) {
	int firstNumber = 0;
	int secondNumber = 1;
	int thirdNumber;
	int i;
	n = fibo(n);
	
	fiboArray.add(firstNumber);
	fiboArray.add(secondNumber);
	   
	 System.out.print(firstNumber+" "+secondNumber ); 
	    
	 for(i=2; i<n; i++) {    
		 
		 thirdNumber=firstNumber+secondNumber ;    
		 System.out.print(" "+thirdNumber);    
		 firstNumber=secondNumber ;    
		 secondNumber =thirdNumber;
		 fiboArray.add(thirdNumber);
	 } 
	return fiboArray;
}

	
//	public static List<Integer> fibonacci(int n, List<Integer> fiboArray) {
//		int firstNumber = 0;
//		int secondNumber = 1;
//		int thirdNumber;
//		int i;
//		
//		fiboArray.add(firstNumber);
//		fiboArray.add(secondNumber);
//		   
//		 System.out.print(firstNumber+" "+secondNumber ); 
//		    
//		 for(i=2; i<n; i++) {    
//			 
//			 thirdNumber=firstNumber+secondNumber ;    
//			 System.out.print(" "+thirdNumber);    
//			 firstNumber=secondNumber ;    
//			 secondNumber =thirdNumber;
//			 fiboArray.add(thirdNumber);
//		 } 
//		return fiboArray;
//	}
	
	public static void findIndex (int a, List<Integer> fiboArray) {
		
		for(int i =0; i<= fiboArray.size(); i++) {
			
			if(fiboArray.get(i) == a) {
				System.out.println("The number: " + fiboArray.get(i));
				System.out.print("The index number: " + i);
				break;
			}
			else if (fiboArray.get(i)>a) {
				System.out.println("The number you are looking for is not available. The number in the index closest to the number you are looking for: " + fiboArray.get(i-1));
				System.out.println("The index number: " + i);
				break;
			}	
		}
	}

	public static void main(String[] args) {
		
		 List <Integer> fiboArray = new ArrayList<>();
			
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter the number of fibonacci array: ");
			int fibonacciArray = input.nextInt();
			
			
			fibonacci(fibonacciArray,fiboArray);
			System.out.println();
			System.out.print("Please enter the number that you want to check: ");
			int checkNumber = input.nextInt();
			
			findIndex(checkNumber,fiboArray);
	}

}
