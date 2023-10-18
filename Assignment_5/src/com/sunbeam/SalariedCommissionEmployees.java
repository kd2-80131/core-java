package com.sunbeam;

import java.util.Scanner;

public class SalariedCommissionEmployees extends Employees {
	private double comm;
	private int noOfSales;
	private double baseSalary;
	
	public SalariedCommissionEmployees() {		
	}
	@Override
	void acceptData() {
		super.acceptData();
		System.out.print("Enter the Commission percentage per sale: ");
		this.comm = new Scanner(System.in).nextDouble();
		System.out.print("Enter the No. of sale: ");
		this.noOfSales = new Scanner(System.in).nextInt();
		System.out.print("Enter Employee Salary - ");
		this.baseSalary = new Scanner(System.in).nextDouble();
	}
	@Override
	public void calculateSalary() {
		double totalSalary;
		totalSalary = this.comm * this.noOfSales + this.baseSalary;
		System.out.println("The Amount to be paid is: " + totalSalary);
		
	}
	@Override
	public String toString() {
		return "SalariedCommissionEmployees [" + super.toString() + ", comm=" + comm + ", noOfSales=" + noOfSales + ", baseSalary=" + baseSalary + "]";
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
}
