package com.sunbeam.app;

import java.util.Scanner;

public class BaseSalariedCommEmp extends CommisionEmployee {

	private double base_salary;
	private double new_base_salary;
	
	public BaseSalariedCommEmp(Scanner sc) {
		super(sc);
		System.out.println("Enter Base Salary for new Base Salaried Commission Employee:");
		base_salary = sc.nextDouble();	
		new_base_salary =(1.1)*base_salary;
	}
	
	public void display() {
		super.display();
		System.out.println("Base Salary of Base Salaried Commission Employee:"+this.base_salary);
		System.out.println("Base Salary after 10% increment for current pay period of Base Salaried Commission Employee:"+this.new_base_salary);
	}
}
