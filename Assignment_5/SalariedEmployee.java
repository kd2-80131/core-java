package com.sunbeam;

import java.util.Scanner;

public class SalariedEmployee extends Employees {
	private int salary;
	
	public SalariedEmployee() {	
	}
	@Override
	void acceptData() {
		super.acceptData();
		System.out.print("Enter Employee Salary - ");
		this.salary = new Scanner(System.in).nextInt();
	}
	@Override
	public void calculateSalary() {}
	@Override
	public String toString() {
		return "SalariedEmployee [" + super.toString() +"salary=" + salary + "]";
	}
	
	
}
