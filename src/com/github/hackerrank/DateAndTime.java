package com.github.hackerrank;

import java.time.LocalDate;

/*
Hackerrank
The Calendar class is an abstract class that provides 
methods for converting between a specific instant in 
time and a set of calendar fields such as YEAR, MONTH, 
DAY_OF_MONTH, HOUR, and so on, and for manipulating the 
calendar fields, such as getting the date of the next week.

You are given a date. 
You just need to write the method,get day ,
which returns the day on that date. To simplify your task, 
we have provided a portion of the code in the editor.
 */

public class DateAndTime {
	
	public static String findDay(int month, int day, int year) {

		return LocalDate.of(year, month, day).getDayOfWeek().name(); //verilen tarihe ait gün ismini getiriyor
    }

	public static void main(String[] args) {
	
			System.out.println(findDay(9, 18, 1989));
			System.out.println(findDay(8, 5, 2015));
			
	}

}
