package com.sunbeam.app;

import java.util.Scanner;

public class Application {

	public static int menu(Scanner sc) {
		int choice;
		System.out.println("Welcome to the Organization"); 
		System.out.println("1.Enter a normal Employee : "); 
		System.out.println("2.Enter an Hourly Employee : "); 
		System.out.println("3.Enter a Salaried Employee : "); 
		System.out.println("4.Enter a Commission Employee : "); 
		System.out.println("5.Enter a Base Salaried Commission Employee : ");
		System.out.println("6.Display all Employees : ");
		System.out.println("0.Exit");
		System.out.println("Enter Your Choice : ");
//		Scanner sc = new Scanner(System.in)
		choice =  sc.nextInt();
		return choice;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Employees you want in organization:");
		Employee [] Arr = new Employee[sc.nextInt()];
		int index = 0;
		while((choice=menu(sc))!=0) {
			switch (choice) {
			case 1:
				if(index<Arr.length)
				{
					Arr[index] = new Employee(sc);
					index++;
				}
				else
				{
					System.out.println("No more Employee can be added");
				}
				break;
             case 2:
            	 if(index<Arr.length)
 				{
 					Arr[index] = new HourlyEmployee(sc);
 					index++;
 				}
 				else
 				{
 					System.out.println("No more Employee can be added");
 				}
				
				break;
             case 3:
            	 if(index<Arr.length)
  				{
  					Arr[index] = new SalariedEmployee(sc);
  					index++;
  				}
  				else
  				{
  					System.out.println("No more Employee can be added");
  				}
 				
	
            	 break;
             case 4:
            	 if(index<Arr.length)
   				{
   					Arr[index] = new CommisionEmployee(sc);
   					index++;
   				}
   				else
   				{
   					System.out.println("No more Employee can be added");
   				}
  				
	
            	 break;
             case 5:
             	 if(index<Arr.length)
    				{
    					Arr[index] = new BaseSalariedCommEmp(sc);
    					index++;
    				}
    				else
    				{
    					System.out.println("No more Employee can be added");
    				}
   				
	
            	 break;
            	 
             case 6:
             	for (Employee employee : Arr) {
					employee.display();
				}
             	
            	 break;
            	 
			default:
				System.out.println("Wrong Choice Entered");
				break;
			}
		}
		System.out.println("Thanks for using my Application");
	}

}
