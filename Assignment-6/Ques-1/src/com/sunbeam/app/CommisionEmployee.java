package com.sunbeam.app;

import java.util.Scanner;

public class CommisionEmployee extends Employee{
	private int grossSales;
	private double commissionRate;
	
	public CommisionEmployee(Scanner sc) {
		super(sc);
		System.out.println("Enter grossSales for the  new Commision Employee:");
		
		this.grossSales = sc.nextInt();
		System.out.println("Enter commision Rate for the new Commission Employee:");
		this.commissionRate = sc.nextDouble();
	}
	
	
	public void display() {
		super.display();
		System.out.println("GrossSales of Commision Employee: "+this.grossSales);
		System.out.println("Commission Rate of Commision Employee: "+this.commissionRate);
	}
	
}
