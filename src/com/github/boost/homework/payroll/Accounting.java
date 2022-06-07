package com.github.boost.homework.payroll;

import java.time.Period;

public abstract class Accounting {
	
	private int period;
	private Employee employees;
	
	public Accounting(int period, Employee employees) {
		this.period = period;
		this.employees = employees;
	}
	public int getPeriod() {
		return period;
	}
	public Employee getEmployee() {
		return employees;
	} 
	public abstract double getEarnings();
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Period: ").append(period);
		return "Accounting [period=" + this.period + ", employees=" + this.employees + "]";
	} 
	
}
