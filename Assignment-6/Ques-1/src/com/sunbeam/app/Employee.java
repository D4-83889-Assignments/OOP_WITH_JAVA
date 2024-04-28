package com.sunbeam.app;

import java.util.Scanner;

public class Employee {
	
	private String firstName;
	private String lastName;
	private final int SSN;
	private static int autoGenSSN;
	
	static {
		autoGenSSN = 1000;
	}
	
	{
		SSN  = autoGenSSN++;
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

	public int getSSN() {
		return this.SSN;
	}

	public Employee(Scanner sc) {
//		super();
		System.out.println("Enter Employee FirstName:");
		this.firstName = sc.next();
		System.out.println("Enter Employee LastName:");
		this.lastName = sc.next();
//		SSN = sSN;
	}
	
	public void display() {
		System.out.println("FirstName: "+this.firstName);
		System.out.println("LastName: "+this.lastName);
	}

	
	
}
