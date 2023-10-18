package com.sunbeam;

public class TestEmployees {
	public static void main(String[] args) {
		Employees employee1;
		System.out.println("For Salaried Employee: ");
		employee1 = new SalariedEmployee();  
		employee1.acceptData();
		System.out.println(employee1);
		
		System.out.println();
		
		Employees employee2;
		System.out.println("For Hourly Paid Employee: ");
		employee2 = new HourlyEmployees();  
		employee2.acceptData();
		System.out.println(employee2);
		employee2.calculateSalary();
		
		System.out.println();
		
		Employees employee3;
		System.out.println("For Commissioned Employee: ");
		employee3 = new ComissionEmployees();  
		employee3.acceptData();
		System.out.println(employee3);
		employee3.calculateSalary();
		
		System.out.println();
		
		Employees employee4;
		System.out.println("For Salaried-Commissioned Employee: ");
		employee4 = new SalariedCommissionEmployees();  
		employee4.acceptData();
		System.out.println(employee4);
		employee4.calculateSalary();
		
		System.out.println();
		
		SalariedCommissionEmployees emp = (SalariedCommissionEmployees) employee4;
		double increaseSalary = emp.getBaseSalary() * 0.110;
		emp.setBaseSalary(increaseSalary);
		System.out.println("Increased Base Salary for Salaried Commissioned Employee: " + emp.getBaseSalary());
		
		
	}
}
