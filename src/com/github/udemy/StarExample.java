package com.github.udemy;

public class StarExample {

	public static void main(String[] args) {
		
		StarExample st = new StarExample();
		st.drawFillStar(5,5);
		System.out.println();
		st.drawVoidStar(5, 5);

	}
	
	public void drawFillStar(int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("*");
				if(j == column-1) {
					System.out.println();
				}
			}
			
		}
	}
	
	public void drawVoidStar(int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if(i == 0 || i == row-1) {
					System.out.print("*");
					if (j == column-1) 
						System.out.println();
				}
				else {
					if (j == 0) 
						System.out.print("*");
					else if ( j == column-1) 
						System.out.println("*");
					else
						System.out.print(" ");
					}
				}
				
			}
			
		}
	}


