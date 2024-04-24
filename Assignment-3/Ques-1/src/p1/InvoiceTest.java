package p1;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter part Num: ");
		String partNum = new Scanner(System.in).nextLine();
		
		System.out.println("Enter partDesc: ");
		String partDesc = new Scanner(System.in).nextLine();
		
		System.out.println("Enter part Price: ");
		double partPrice = new Scanner(System.in).nextDouble();
		System.out.println("Enter part Quantity: ");
		int partQuant = new Scanner(System.in).nextInt();
		Invoice i = new Invoice();
		i.setPartDesc(partDesc);
		i.setPartNum(partNum);
		i.setPartPrice(partPrice);
		i.setPartQuant(partQuant);
		System.out.println(i.getPartDesc());
		
		double Amount = i.CalculateAmount();
		System.out.println("Amount is "+Amount);
	}

}
