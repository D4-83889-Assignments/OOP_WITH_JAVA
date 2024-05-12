package com.app.Generics.Sort;

import java.io.StringBufferInputStream;
import java.util.Comparator;

class SortOnRoll implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.getRoll_no() - o2.getRoll_no();
	}

}

class SortOnName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.getName().compareTo(o2.getName());
	}

}

class SortOnMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub

		return -Double.compare(o1.getMarks(), o2.getMarks());
	}

}

class SortOnCourse implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		
		
		return o1.getCourse().compareTo(o2.getCourse());
	}
		
}

public class SortServices {

}
