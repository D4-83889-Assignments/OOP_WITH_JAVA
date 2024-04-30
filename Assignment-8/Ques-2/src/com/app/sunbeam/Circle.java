package com.app.sunbeam;

import java.util.Scanner;

public class Circle {
 private Point2D centerPoint;
 private double myDiameter;
 
 
 Circle(){
	 centerPoint = new Point2D(0,0);
	 myDiameter = 100;
 }
 
 public void setDiameter (Scanner sc) throws DiameterNegativeException{
	 System.out.println("Enter Diameter: ");
	 double diameter = sc.nextDouble();
	 if(diameter<0) {
		 throw new DiameterNegativeException("Diameter cannot be negative");
	 }
	 
	 myDiameter = diameter;
	 System.out.println("Diameter Set to "+myDiameter);
 }
}
