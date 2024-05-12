package com.app.Generics.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Tester {

	public static int menu(Scanner sc)
	{
		System.out.println("*************************Student Management System****************************************");
		System.out.println("1. Add a Student");
		System.out.println("2. Display All Students Sorted on Rollno");
		System.out.println("3. Display All Students Sorted on Marks in Desc Order");
		System.out.println("4. Display All Students Sorted on Course");
		System.out.println("5. Display All Students Sorted on Name");
		System.out.println("0.Exit");
		System.out.println("Enter Your Choice");
		return sc.nextInt();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice ;
		Scanner sc = new Scanner(System.in);
		List<Student> list =  new ArrayList<Student>();
		while((choice=menu(sc))!=0)
		{
			switch (choice) {
			case 1:
				Student e = new Student();
				e.accept(sc);
				 list.add(e);
				 System.out.println("Student Added");
				break;
			case 2: 
				if(list.size()>1)
				{
					Comparator c = new SortOnRoll();
					Collections.sort(list,c);
					for (Student student : list) {
						
						System.out.println(student);
					}
				}
				else
				{
					System.out.println("Can't sort single or lesser entries.");
				}
				break;
				
			case 3: 
				if(list.size()>1)
				{
					Comparator c = new SortOnMarks();
					Collections.sort(list,c);
					for (Student student : list) {
						
						System.out.println(student);
					}
				}
				else
				{
					System.out.println("Can't sort single or lesser entries.");
				}
				break;
				
			case 4: 
				if(list.size()>1)
				{
					Comparator c = new SortOnCourse();
					Collections.sort(list,c);
					for (Student student : list) {
						
						System.out.println(student);
					}
				}
				else
				{
					System.out.println("Can't sort single or lesser entries.");
				}
				break;
				
			case 5: 
				if(list.size()>1)
				{
					Comparator c = new SortOnName();
					Collections.sort(list,c);
					for (Student student : list) {
						
						System.out.println(student);
					}
				}
				else
				{
					System.out.println("Can't sort single or lesser entries.");
				}
				break;

			default:
				System.out.println("Wrong Option Entered");
				break;
			}
		}
		
		System.out.println("Thanks for using my Application");

	}

}
