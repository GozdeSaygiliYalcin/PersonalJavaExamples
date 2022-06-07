package com.github.boost;

import java.util.ArrayList;
import java.util.Scanner;

public class SuperMarketHomework {

	public static void main(String[] args) {
		
		String product [] = {"Coke", "Olive", "Milk", "Tea", "Egg", "Sugar"};
		
		ArrayList<String> myBasket = new ArrayList<String>();
		
		while(true) {
		displayMenu();
		
		Scanner menu =new Scanner(System.in);
		System.out.print("Please select what do you want? ");
		int input = menu.nextInt();
		
			switch (input) {
			case 1: 
				
				printMyBasket(myBasket);
				break;
				
			case 2:
				addProduct(product, myBasket);
				break;
				
			case 3:
				printMyBasket(myBasket);
				break;
				
			case 4:
				endShopping();
				break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + menu);
			}
		}
	}
	
	private static void displayMenu() {
		
		System.out.println("==========================");
		System.out.println("1- Show products");
		System.out.println("2- Add any product(s) to your basket");
		System.out.println("3- Show my basket");
		System.out.println("4- Exit");
		System.out.println("==========================");
	}
	
	public static void printProducT(String product[]) {
		
		for(int i=0; i<product.length; i++) {
			System.out.println(i+1 + "-" +product[i]);
		
		}
	}	
		
	public static void addProduct(String product[], ArrayList<String> myBasket) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Please enter the product number you wanted to buy");
		
		int added = input.nextInt();
		myBasket.add(product[added-1]);
		System.out.println(product[added-1] +" added to your basket");

	}
	
	public static void printMyBasket(ArrayList<String> myBasket) {
		System.out.println("Following product(s) in your basket");
		
		for (String productInMyBasket : myBasket) {
			System.out.println(productInMyBasket);
		}
	}
	
	public static void endShopping() {
		System.exit(0);
		System.out.println("Thanks for using this application. We welcome any feedback!");
	}

}
	

