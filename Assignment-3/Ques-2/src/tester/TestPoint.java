package tester;
import com.app.geometry.Point2D;

//import com.app.geometry.Point2D;



public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p1 = new Point2D(1,5);
		Point2D p2 = new Point2D(1,5);
		if(p1.isEqual(p2))
		{
			System.out.println("Points are same..");
		}
		else
		{
			System.out.println("Distance between the points is "+p1.calculateDistance(p2));
		}
	}

}


