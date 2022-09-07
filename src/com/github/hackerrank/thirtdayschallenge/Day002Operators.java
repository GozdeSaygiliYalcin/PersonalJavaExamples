package com.github.hackerrank.thirtdayschallenge;

import java.io.*;


public class Day002Operators {
	
	 public static void solve(double meal_cost, int tip_percent, int tax_percent) {
		 double tip  = (meal_cost*tip_percent*0.01);
		 double tax = (meal_cost*tax_percent*0.01);
		 
		 System.out.println(Math.round(meal_cost+tip+tax));

	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());
        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());
        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());
        Day002Operators.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();

	}

}
