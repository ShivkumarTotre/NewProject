// Array Program of Object

package com.ArrayObject;

import java.util.*;

class Student1{

	int sid;
	String sname;
	double marks;
	
	public Student1(int sid, String sname, double marks)
	{
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	
	public String toString()
	{
		return sid+" "+sname+" "+marks;
	}
}

public class ArrayObject1 {

	public static void main(String[] args) {

		Student1 s[] = new Student1[3];
		Scanner sc = new Scanner(System.in);
		
//		s[0] = new Student(101,"Yash",72);
//		s[1] = new Student(102,"Shiv",89.90);
//		s[2] = new Student(103,"Jay",85.00);
		
//		for(int i = 0; i < s.length; i++)
//		{
//			System.out.println(s[i]);
//		}
		
		for(int i = 0; i < s.length; i++)
		{
			System.out.println("Enter the id");
			int id = sc.nextInt();
			System.out.println("Enter the Name");
			String s1 = sc.next();
			System.out.println("Enter the Percentage");
			double d = sc.nextDouble();
			
			s[i] = new Student1(id, s1, d);
		}
		
		for(int i = 0; i < s.length; i++)				// Using Traditional loop
		{
			System.out.println(s[i]);
		}
		
		System.out.println("------------------------------------");
		for(Student1 s1 : s)							// Using Enhance for loop
		{
			System.out.println(s1);
		}
	}
}
