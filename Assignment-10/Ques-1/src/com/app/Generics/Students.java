package com.app.Generics;

public class Students implements Comparable
{
	
	int roll_no;
	String name;
	int marks;
	
	public Students(String name, int roll_no, int marks) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.roll_no = roll_no;
		this.marks = marks;
		
	}
	public Students() {
		
	}

	public int compareTo(Object obj)
	{
		Students s = (Students)obj;
		if(this.marks>s.marks)
		{
			return -1;
		}
		else if(this.marks<s.marks)
		{
			return 1;
		}
		return 0;
	}
	
	public String toString()
	{
		return "["+this.roll_no+","+this.name+","+this.marks+"]";
	}
}
