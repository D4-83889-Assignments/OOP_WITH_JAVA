package com.app.sunbeam;

import java.util.Scanner;

public class Cricketer extends Player implements Batter,Bowler {

	private int wickets;
	private int runs;
	@Override
	public int getWickets() {
		// TODO Auto-generated method stub
		
		return wickets ;
	}

	@Override
	public int getRuns() {
		// TODO Auto-generated method stub
		return runs;
	}
	
	public Cricketer()
	{
		wickets = 0;
		runs = 0;
		setAge(0);
		setId(0);
		setMatchesPlayed(0);
		setName("");
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter Name: ");
		sc.nextLine();
		setName(sc.nextLine());
		System.out.println("Enter Age: ");
		setAge(sc.nextInt());
		System.out.println("Enter Id: ");
		setId(sc.nextInt());
		System.out.println("Enter Matches Played:");
		setMatchesPlayed(sc.nextInt());
		System.out.println("Enter Runs for Current Cricketer: ");
		runs = sc.nextInt();
		System.out.println("Enter Wickets for Current Cricketer: ");
		wickets = sc.nextInt();
	}
	
	public String toString() {
		return "Name: "+getName()+" Age: "+getAge()+" Id: "+getId()+" Matches Played "+getMatchesPlayed()+" Runs Scored: "+getRuns()+
				"Wickets Taken: "+getWickets()+" Total Matches: "+getMatchesPlayed();
	}
	
	public void displayName() {
		System.out.println("Name: "+getName()); 
	}
	
	public void displayMatches() {
		System.out.println("Matches Played: "+getMatchesPlayed());
	}
	
	public void displayRuns() {
		System.out.println("Runs: "+getRuns());
	}
	
	public void displayWicket() {
		System.out.println("Wickets: "+getWickets());
	}
	
}

