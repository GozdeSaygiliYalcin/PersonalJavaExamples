package com.github.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSolution {

	public static void main(String[] args) {
		
	       Scanner scan=new Scanner(System.in);

	       int askNumber=scan.nextInt();

	       ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();

	       for(int i=0;i<askNumber;i++) {
	    	   
	        int size=scan.nextInt();
	        ArrayList<Integer> list=new ArrayList();

	        for(int j=0;j<size;j++) {
	        	
	             int item=scan.nextInt();
	             list.add(item);
	          }
	         mainlist.add(list);
	      }

	       int totalprint=scan.nextInt();
	       for(int k=0;k<totalprint;k++) {
	    	   
	         int row=scan.nextInt();
	         int col=scan.nextInt();
	         try
	          {
	          System.out.println(mainlist.get(row-1).get(col-1));
	          }
	         catch(Exception e)
	         {
	         System.out.println("ERROR!");
	         }
	       }
	       scan.close();
	       }
	   }
