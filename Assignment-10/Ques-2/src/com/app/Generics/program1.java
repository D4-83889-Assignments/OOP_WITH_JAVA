package com.app.Generics;

import java.util.Arrays;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products[] arr = {new Products(1,"Vim","Soap",34.5),new Products(2,"Rin","Detergent",34.5),new Products(3,"Colgate","Toothpaste",34.5),
				new Products(1,"Rayban","Spectacles",34.5),new Products(1,"FastTrack","Watch",34.5)};
		
		
		System.out.println("Before Sorting");
		for (Products products : arr) {
			System.out.println(products);
		}
		System.out.println("After Sorting");
		Arrays.sort(arr);
		
		for (Products products : arr) {
			System.out.println(products);
		}
		
	}

}
