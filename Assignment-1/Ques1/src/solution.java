import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1,d2,avg;
		System.out.println("Enter Numbers");
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		if(s.hasNextDouble())
		{
			d1 = s.nextDouble();
			System.out.println("Enter 2nd number:");
			if(s.hasNextDouble()) {
				d2 = s.nextDouble();
				{
					avg = (d1+d2)/2;
					System.out.println("Average is : "+avg);
				}
			}
			else
			{
				System.out.println("Error: 2nd value is not double");
			}
			
			
		}
		else
		{
			System.out.println("Error: 1st value is not double");
		}
		
		s.close();
		
	}

}
