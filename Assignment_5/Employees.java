package com.sunbeam;

import java.util.Scanner;

abstract public class Employees {
	private int empid;
	private String firstName;
	private String lastName;
	private int hrsWorked;
	private String ssn;
	
	public Employees() {
	}
	public Employees(int empid, String firstName, String lastName, int salary, int hrsWorked) {
		this.empid = empid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.hrsWorked = hrsWorked;
	}
	void acceptData() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Employee Id - ");
		this.empid = scan.nextInt();
		System.out.print("Enter Employee First Name - ");
		this.firstName = scan.next();
		System.out.print("Enter Employee Last Name - ");
		this.lastName = scan.next();
		System.out.print("Enter Employee Hours Worked - ");
		this.hrsWorked = scan.nextInt();
		System.out.print("Enter Social Security Number - ");
		this.ssn = scan.next();
		
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getHrsWorked() {
		return hrsWorked;
	}
	public void setHrsWorked(int hrsWorked) {
		this.hrsWorked = hrsWorked;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return " empid=" + empid + ", firstName=" + firstName + ", lastName=" + lastName + ", hrsWorked=" + hrsWorked + ", ssn=" + ssn ;
	}
	abstract public void calculateSalary();
}
