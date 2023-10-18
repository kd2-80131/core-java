package com.sunbeam;

import java.util.Scanner;

public class HourlyEmployees extends Employees {
	private int hourlySalaryRate;
	public HourlyEmployees() {
	}
	@Override
	void acceptData() {
		super.acceptData();
		System.out.print("Enter the Hourly Salary Rate: ");
		this.hourlySalaryRate = new Scanner(System.in).nextInt();
	}
	@Override
	public void calculateSalary() {
		double totalSalary;
		if(getHrsWorked() > 40)
		    totalSalary = (40 * hourlySalaryRate) + (getHrsWorked() - 40) * hourlySalaryRate * 1.5;
		else
			totalSalary = getHrsWorked() * hourlySalaryRate;
		System.out.println("Total Amount to be Paid: " + totalSalary);
	}
	@Override
	public String toString() {
		return "HourlyEmployees [" + super.toString() + "hourlySalaryRate=" + hourlySalaryRate +  "]";
	}
	
	
}
