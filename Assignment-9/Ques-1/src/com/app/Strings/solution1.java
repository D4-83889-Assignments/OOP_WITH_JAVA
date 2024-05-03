package com.app.Strings;

import java.util.Scanner;

public class solution1 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		// TODO Auto-generated method stub
		//write a program to reverse a String;
		System.out.println("Enter a String");
//		sc.nextLine();
		String s1  = sc.nextLine();
		System.out.println(s1);
		StringBuilder s2 = new StringBuilder(s1);
		s2.reverse();
		System.out.println("Reversed String: ");
		System.out.println(s2);
		
	}

}
