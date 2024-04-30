package com.app.sunbeam;

import java.util.Scanner;

public class tester {

	public static void TestLen (int length) throws ExceptionLineTooLong{
		if(length>80) {
			throw new ExceptionLineTooLong("The String is too long");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
//		sc.nextLine();
		String test  = sc.nextLine();
		try {
		TestLen(test.length());
		System.out.println("String is less than 80 characters");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
