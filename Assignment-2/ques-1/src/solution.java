import java.util.Scanner;

public class solution {

//	public int menu() {
//		int choice;
//		System.out.println("Credit Limit Calculator");
//		System.out.println("1. Enter Details ");
//		System.out.println("1. Check Result ");
//		
//		return 1;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Credit Limit Calculator");
		System.out.println("Enter Details: ");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int accountNumber = s.nextInt();
		System.out.println("Enter Pending Balance: ");
		int pendingBalance = s.nextInt();
		System.out.println("Enter Total Charges for this month: ");
		int totalCharges= s.nextInt();
		System.out.println("Enter Applied credit: ");
		int creditApplied = s.nextInt();
		System.out.println("Enter Credit Limit: ");
		int  creditLimit = s.nextInt();
		int balanceLeft = (pendingBalance+totalCharges-creditApplied);
		if(balanceLeft<creditLimit)
		{
			System.out.println("Credit limit not exceeded for the month");
			System.out.println("Credit Left: "+(creditLimit-balanceLeft));
		}
		else
		{
			System.out.println("Credit Limit Exceeded");
		}
	}

}
