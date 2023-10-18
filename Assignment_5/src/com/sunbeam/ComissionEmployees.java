package com.sunbeam;

import java.util.Scanner;

public class ComissionEmployees extends Employees{
	private double comm;
	private int noOfSales;
	
	public ComissionEmployees() {
	}
	@Override
	void acceptData() {
		super.acceptData();
		System.out.print("Enter the Commission percentage per sale: ");
		this.comm = new Scanner(System.in).nextDouble();
		System.out.print("Enter the No. of sale: ");
		this.noOfSales = new Scanner(System.in).nextInt();
	}
	@Override
	public void calculateSalary() {
		double totalSalary;
		totalSalary = this.comm * this.noOfSales;
		System.out.println("The Amount to be paid is: " + totalSalary);
		
	}
	@Override
	public String toString() {
		return "ComissionEmployees [" + super.toString()+ "comm=" + comm + ", noOfSales=" + noOfSales + "]";
	}
	
}
