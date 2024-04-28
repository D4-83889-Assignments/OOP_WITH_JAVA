package com.sunbeam.app;

import java.util.Scanner;

public class HourlyEmployee extends Employee {

	private double wage;
	private int hrs;
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	} 
	
	
	public HourlyEmployee(Scanner Sc) {
		super(Sc);
		System.out.println("Enter Wage: ");
		wage = Sc.nextDouble();
		System.out.println("Enter Hours");
		hrs = Sc.nextInt();
	}
	
	public void display()
	{
		super.display();
		System.out.println("Wage of Hourly Employee: "+wage);
		System.out.println("Hours Worked of Hourly Employee: "+hrs);
	}
	
}
