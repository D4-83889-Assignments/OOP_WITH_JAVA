package com.app.sunbeam;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Scanner sc = new Scanner(System.in);
		try {
			
			c1.setDiameter(sc);
			
		} catch (Exception e) {
			System.out.println("Exception: "+e.getMessage());
		}
		finally {
			sc.close();
		}
		
	}

}
