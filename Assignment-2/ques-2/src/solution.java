import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Per Day Driving Cost Calculator");
//		Scanner sc = new Scanner(System.in);
//		new Scanner(System.in).nextInt();
		System.out.println("Enter Total Miles Driven Per Day: ");
		int totalMiles = new Scanner(System.in).nextInt();
		System.out.println("Cost Per Gallon Of Gasoline: ");
		int gasolineRate = new Scanner(System.in).nextInt();
		System.out.println("Miles Driven Per Gallon of Gasoline: ");
		int milesDrivenPerGallon = new Scanner(System.in).nextInt();
		System.out.println("Parking Cost: ");
		int parkingCost = new Scanner(System.in).nextInt();
		System.out.println("Toll Cost: ");
		int tollCost = new Scanner(System.in).nextInt();
		
		int totalCost = (totalMiles/milesDrivenPerGallon)*gasolineRate + (parkingCost+tollCost);
		
		System.out.println("Your Daily Driving Cost: "+totalCost);
	}

}


