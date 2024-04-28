package com.sunbeam.app;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	
	public void setSalary(int weeklySalary)
	{
		this.weeklySalary = weeklySalary;
	}
	
	public double getSalary() {
		return this.weeklySalary;
	}

	public SalariedEmployee(Scanner sc) {
		super(sc);
		System.out.println("Enter Weekly Salary");
		weeklySalary = sc.nextDouble();
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		super.display();
		System.out.println("Weekly Salary of Salaried Employee:"+weeklySalary);
	}
}


