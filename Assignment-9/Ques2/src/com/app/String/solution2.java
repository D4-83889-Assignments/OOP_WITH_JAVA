package com.app.String;

import java.util.Scanner;

public class solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String to check if it is a palindrome");
		String s = sc.nextLine();
		StringBuilder s1 = new StringBuilder(s);
		s1.reverse();
		String s2 = new String(s1);
		if(s.equals(s2)) {
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Plaindrome");
		}
		
	}

}
