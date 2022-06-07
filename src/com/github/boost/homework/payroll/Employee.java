package com.github.boost.homework.payroll;

import java.time.LocalDate;

public class Employee {
	
	private String name;
	private String idNumber;
	private boolean hourlyBased;
//	private static int employeeCounter;

	public Employee(String name, String idNumber) {
		super();
		this.name = name;
		this.idNumber = idNumber;
	}
	public String getName() {
		return this.name;
	}
	
	public String getIdNumber() {
		return this.idNumber;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + this.name + ", idNumber=" + this.idNumber + "]";
	}
	
}
