package tester;

import java.awt.SystemColor;
import java.util.Iterator;
import java.util.Scanner;

import com.app.geometry.Point2D;


public class TestPointArray1 {

	public static int menu() {
		
		int choice;
		System.out.println("*****************Welcome to Application*********************");
		System.out.println("1.Display Details of a specific point");
		System.out.println("2.Display x,y coordinates of all points");
		System.out.println("3.Calculate Distance between two points");
		System.out.println("4.Exit");
		System.out.println("Enter your choice");
		choice  = new Scanner(System.in).nextInt();
		
		
		
		return choice;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no. of point you want to Create....");
		Point2D [] arr  = new Point2D[new Scanner(System.in).nextInt()];
		int x,y;

		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter X Coordinate");
			x = new Scanner(System.in).nextInt();
			
			System.out.println("Enter Y Coordinate");
			y = new Scanner(System.in).nextInt();
			
			arr[i] = new Point2D(x,y);
//			System.out.println();
		}
		
		int choice;
		
		while((choice=menu())!=4)
		{
			switch (choice) {
			case 1:
				System.out.println("Enter index of a point you want to check..");
				int index = new Scanner(System.in).nextInt();
				if(index>=0 && index<=arr.length-1)
					System.out.println(arr[index].getDetails());
				else
					System.out.println("Enter valid index..");
				break;
				
			case 2:
				for (int i = 0; i < arr.length; i++) {
					System.out.println("X-coord: "+arr[i].xCoord);
					System.out.println("Y-coord: "+arr[i].yCoord);
				}
				
				break;
			case 3:
				System.out.println("Enter start point index");
				int Sindex  = new Scanner(System.in).nextInt();
				
				if(Sindex>=0)
				{
					System.out.println("Enter end point index");
					int Eindex = new Scanner(System.in).nextInt();
					if(Eindex<=arr.length-1)
					{
						if(arr[Sindex].isEqual(arr[Eindex]))
						{
							System.out.println("Points are same");
						}
						else
						{
							System.out.println("Distance between the point: "+arr[Sindex].calculateDistance(arr[Eindex]));	
						}
						
						
					}
					else
					{
						System.out.println("End index is out of bounds...");
					}
				}
				else
				{
					System.out.println("Start index should be greater than or equal to zero...");
				}
			
				

				
				
				
				
				break;
			default:
				System.out.println("Wrong Choice Given....Try Again");
				break;
			}
		}
		System.out.println("Thanks for using my Application");
	}
	

}


