package com.app.sunbeam;

import java.util.Scanner;

public class Tester {

	public static int menu(Scanner sc) {
//		int choice;
		System.out.println("Welcome to my Application");
		System.out.println("1. Add a Cricketer");
		System.out.println("2. Display Total Runs");
		System.out.println("3. Display Total Wickets");
		System.out.println("4. Display Total Matches Played");
		System.out.println("5. Display Name of Cricketers");
		System.out.println("6. Display No.of Matches Played by Each Cricketer");
		System.out.println("0. Exit");
		System.out.println("Enter your choice");
		
		
		return sc.nextInt();
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		int sum =  0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of players you want to work with..");
		Cricketer arr[] = new Cricketer[sc.nextInt()];
		int index = 0;
		while((choice=menu(sc))!=0)
		{
			switch (choice) {
			case 1:
				if(index<arr.length)
				{
					arr[index] = new Cricketer();
					arr[index].accept(sc);
					index++;
				}
				else
				{
					System.out.println("Can't Add more cricketers");
				}
				break;
				
			case 2:
				for (Cricketer cricketer : arr) {
					
					sum +=cricketer.getRuns();
					
					
				}
				System.out.println("Total Runs: "+sum);
				sum = 0;
				break;
				
			case 3:
				for (Cricketer cricketer : arr) {
					
					sum +=cricketer.getWickets();
					
				}
				System.out.println("Total Wickets: "+sum);
				sum = 0;
				break;
				
			case 4:
				for (Cricketer cricketer : arr) {
					
					sum +=cricketer.getMatchesPlayed();
					
				}
				System.out.println("Total Matches: "+sum);
				sum = 0;
				
				
				break;

				
		case 5:
				for (Cricketer cricketer : arr) {
					
					cricketer.displayName();
					
				}
				break;
				
		case 6:
			for (Cricketer cricketer : arr) {
				
				cricketer.displayName();
				cricketer.displayMatches();
				
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
