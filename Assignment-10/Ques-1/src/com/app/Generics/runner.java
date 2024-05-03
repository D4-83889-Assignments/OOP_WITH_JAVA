package com.app.Generics;

import java.util.Arrays;
import java.util.Iterator;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students[] s = {new Students("Vatsal",12,45), new Students("Anush",13,56),new Students("Deepak",13,58),
				new Students("Shruti",13,67),new Students("Mahesh",13,40)};
		System.out.println("Before Sort:");
		for (Students students : s) {
			System.out.println(students);
		}
		
		Arrays.sort(s);
		System.out.println("After natural sort based on marks in descending order:");
		for (Students students : s) {
			System.out.println(students);
		}
		
				
	}

}
