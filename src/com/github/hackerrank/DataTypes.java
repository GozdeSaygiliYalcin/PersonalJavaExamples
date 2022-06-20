package com.github.hackerrank;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        int number=input.nextInt();

        for(int i=0;i<number;i++) {
         
            try	{
                long longnumber=input.nextLong();
                
                System.out.println(longnumber+" can be fitted in:");
                if(longnumber>=(Byte.MIN_VALUE) && longnumber<=Byte.MAX_VALUE)
                	System.out.println("* byte");
                
                if(longnumber>=(Short.MIN_VALUE) && longnumber<=Short.MAX_VALUE)
                	System.out.println("* short");
                
                if(longnumber>=(Integer.MIN_VALUE) && longnumber<=Integer.MAX_VALUE)
                	System.out.println("* int");
                
                if(longnumber>=(Long.MIN_VALUE) && longnumber<=Long.MAX_VALUE)
                	System.out.println("* long");

            }
            catch(Exception e) {
                System.out.println(input.next()+" can't be fitted anywhere.");
            }
        }
	}
}