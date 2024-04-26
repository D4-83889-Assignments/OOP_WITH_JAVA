package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static int menu() {
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display All Fruits");
		System.out.println("5.Display Details for Fresh Fruits");
		System.out.println("6.Mark a fruit as Stale");
		System.out.println("7.Display tastes of all Stale Fruits");
		System.out.println("8.Mark Sour Fruits as Stale");
		System.out.println("Enter Your Choice");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int i = 0;
//		int count = 0
		System.out.println("Enter Number of fruits in fruitbasket...");
		Fruits[]fruitBasket = new Fruits[new Scanner(System.in).nextInt()];
		while(((choice = menu())!=0)) {
			switch (choice) {
			case 1:
				if(i<=fruitBasket.length-1)
				{
				fruitBasket[i] = new Mango("Yellow",200.21,"Alphonso",true);
				i++;
				System.out.println("Fresh Mango Added To the basket");
				}
				else
				{
					System.out.println("Can't add more fruits");
				}
				break;
			case 2:
				if(i<=fruitBasket.length-1)
				{
				fruitBasket[i] = new Apple("Orange",100.21,"Orange",true);
				i++;
				System.out.println("Fresh Orange Added To the basket");
				}
				else
				{
					System.out.println("Can't add more fruits");
				}
				break;
			case 3:
				if(i<=fruitBasket.length-1)
				{
				fruitBasket[i] = new Orange("Red",120.21,"Apple",true);
				i++;
				System.out.println("Fresh Apple Added To the basket");
				}
				else
				{
					System.out.println("Can't add more fruits");
				}
				break;
			case 4:
				
				for (Fruits fruits : fruitBasket) {
					if(fruits!=null)
					{
						System.out.println(fruits.getName());
//						System.out.println(fruits.Taste());
					}
				}
	
				break;
			case 5:
				for (Fruits fruits : fruitBasket) {
					if(fruits!=null)
					{
						if(fruits.isFresh())
						{
							System.out.println(fruits.toString());
							System.out.println(fruits.Taste());
						}
						
					}
				}
	
				break;
			case 6:
				System.out.println("Enter Index of Fruit which is Stale");
				int index = new Scanner(System.in).nextInt();
				fruitBasket[index].setFresh(false);
				System.out.println("Fruit marked Stale");
				break;
			case 7:
				System.out.println("Display Stale Fruits");
				for (Fruits fruits : fruitBasket) {
					if(!fruits.isFresh())
					{
						System.out.println(fruits.toString());
						System.out.println(fruits.Taste());
						System.out.println("Is Fresh: "+fruits.isFresh());
					}
				}
	
				break;
			case 8:
				for (Fruits fruits : fruitBasket) {
					if(fruits.Taste()=="sour")
					{
						fruits.setFresh(false);
						System.out.println("All sour fruits are set to Stale");
					}
				}
				break;

			default:
				break;
			}
		}
	}

}
