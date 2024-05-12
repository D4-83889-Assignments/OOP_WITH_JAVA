package com.app.Generics.Sort;

import java.util.Objects;
import java.util.Scanner;

public class Student {
private int roll_no;
 private String name;
 private double marks;
 private String course;
public Student(String name, double marks, String course) {
	//super();
	this.name = name;
	this.marks = marks;
	this.course = course;
}
public Student() {
	//super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [name=" + name +", rollNo: "+roll_no+", marks=" + marks + ", course=" + course + "]";
}
@Override
public int hashCode() {
	return Objects.hash(course, marks, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Objects.equals(course, other.course)
			&& Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks) && name == other.name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
public void accept(Scanner sc) {
	// TODO Auto-generated method stub
	System.out.println("Enter Name");
	name = sc.next();
	System.out.println("Enter Course");
	course = sc.next();
	System.out.println("Enter Roll_no");
	roll_no = sc.nextInt();
	System.out.println("Enter Marks");
	marks = sc.nextInt();
}

    
 
 
 
}
