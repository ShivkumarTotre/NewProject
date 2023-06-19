// Array Program of Object

package com.ArrayObject;

import java.util.*;

class Student{

	int sid;
	String sname;
	double marks;
	
	public Student(int sid, String sname, double marks)
	{
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	
	public String toString()
	{
		return sid+"--"+sname+"--"+marks;
	}
}

public class ArrayObject {

	public static void main(String[] args) {

		Student s[] = new Student[3];
		
		s[0] = new Student(101,"Yash",72);
		s[1] = new Student(102,"Shiv",89.90);
		s[2] = new Student(103,"Jay",85.00);
		
		for(int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}
	}
}
