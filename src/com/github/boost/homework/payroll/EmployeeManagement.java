package com.github.boost.homework.payroll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeManagement {
	
	private ArrayList<Employee> employees = new ArrayList<>();
	private Scanner askString = new Scanner(System.in);
	private Scanner askNumber = new Scanner(System.in);
	private Boolean exit = false;
	
	
	public static void main(String[] args) {
		
		EmployeeManagement management = new EmployeeManagement();
		
	}
	
	private void employeeMenu() {
		
	}
	

	private void listEmployee() {
	
	}
	
	private void initPayroll() {
		
	}
	
	private void listPayroll() {
		
	}
	
	private void sortEmployee() {
		
	
	}
	
	private void sortEmployeesID()
	{
		Collections.sort(employees, new Comparator<Employee>()
		{
			public int compare(Employee first, Employee second)
			{
				return first.getIdNumber().compareTo(second.getIdNumber());
			}
		});
	}
}

