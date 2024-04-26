package com.app.fruits;

public class Fruits {
	private String color ="";
	private double weight;
	private String name;
	private boolean isFresh;
	
	Fruits(){
		color = "";
		name = "";
		isFresh = false;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	Fruits(String color,double weight,String name ){
		this.color = color; 
		this.weight = weight; 
		this.name = name; 
	}
	
public String toString() {
	return "Color: "+color+" Weight: "+Double.toString(weight)+" Name: "+name;
	}

public String Taste() {
	return "No specific taste";
}

}




class Apple extends Fruits{
	Apple(String color,double weight,String name,boolean Fresh){
		super(color,weight,name);
		this.setFresh(Fresh);
	}
	
	public String Taste() {
		return "sweet n sour";
	}
	public String toString() {
		return "Color: "+this.getColor()+" Weight: "+Double.toString(this.getWeight())+" Name: "+this.getName();
	}
}

class Mango extends Fruits{
	Mango(String color,double weight,String name,boolean Fresh){
	
		super(color,weight,name);
		this.setFresh(Fresh);
	}
	
	public String Taste() {
		return "sweet";
	}
	
	public String toString() {
		 return "Color: "+this.getColor()+" Weight: "+Double.toString(this.getWeight())+" Name: "+this.getName();
	}
}

class Orange extends Fruits{
	Orange (String color,double weight,String name,boolean Fresh){
		super(color,weight,name);
		this.setFresh(Fresh);
	}
	
	public String Taste() {
		return "sour";
	}
	
	public String toString() {
		return "Color: "+this.getColor()+" Weight: "+Double.toString(this.getWeight())+" Name: "+this.getName();	
	}
}