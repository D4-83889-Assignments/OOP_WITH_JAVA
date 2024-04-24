package com.app.geometry;

public class Point2D {
	public int xCoord;
	public int yCoord;
	
	public Point2D(int xCoord, int yCoord) {
	
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	

	public String getDetails() {
		return "x-coordinate: "+String.valueOf(xCoord)+" y-coordinate: "+String.valueOf(yCoord);
	}
	
	public boolean isEqual(Point2D p) {
		
		if(this.yCoord==p.yCoord && this.xCoord==p.xCoord)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double calculateDistance(Point2D p) {
		return Math.sqrt(Math.pow((this.xCoord-p.xCoord),2)+Math.pow((this.yCoord-p.yCoord),2));
	}

	
	
}



