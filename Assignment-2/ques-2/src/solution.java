import java.util.Scanner;

public class solution {

	static int menu() {
		

		    System.out.println("Menu");
			System.out.println("1.Dosa");
			System.out.println("2.Samosa");
			System.out.println("3.Pizza");
			System.out.println("4.Ice Creame");
			System.out.println("5.Fruits");
			System.out.println("6.Vegetables");
			System.out.println("7.Salads");
			System.out.println("8.Mexican-Taco");
			System.out.println("9.Thai-Chicken");
			System.out.println("10.Chinese-Momos");
			System.out.println("11.Generate Bill");
			System.out.println("Enter Your Choice:");
			Scanner s = new Scanner(System.in);
			int choice = s.nextInt();
			return choice;

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		int bill = 0;
		int quantity;
		Scanner s = new Scanner(System.in);
		while((choice=solution.menu())!=11) {
		 switch (choice) {
		case 1:
			System.out.println("Enter Quantity");
			quantity = s.nextInt();
			bill +=(quantity*80);
			break;
			
		case 2:
			System.out.println("Enter Quantity");
			quantity = s.nextInt();
			bill +=(quantity*10);
			break;
		case 3:
			System.out.println("Enter Quantity");
			quantity = s.nextInt();
			bill +=(quantity*150);
			break;
		case 4:
			System.out.println("Enter Quantity");
			quantity = s.nextInt();
			bill +=(quantity*80);
			break;
		case 5:
			System.out.println("Enter Quantity");
			quantity = s.nextInt();
			bill +=(quantity*70);
			break;
		case 6:
			System.out.println("Enter Quantity");
			quantity = s.nextInt();
			bill +=(quantity*40);
			break;
		case 7:
			System.out.println("Enter Quantity");
			quantity = s.nextInt();
			bill +=(quantity*140);
			break;
		case 8:
			System.out.println("Enter Quantity");
			quantity = s.nextInt();
			bill +=(quantity*180);
			break;
		case 9:
			System.out.println("Enter Quantity");
			quantity = s.nextInt();
			bill +=(quantity*380);
			break;
		case 10:
			System.out.println("Enter Quantity");
			quantity = s.nextInt();
			bill +=(quantity*100);
			break;

		default:
			System.out.println("Wrong input");
			break;
		}
		
	
	}
		System.out.println("Your final bill is "+bill);
}
	
}
