// Array Program of Object

package com.ArrayObject;

import java.util.*;

class Student2{

	int sid;
	String sname;
	
	public Student2(int sid, String sname)
	{
		this.sid = sid;
		this.sname = sname;
	}
	
	public String toString()
	{
		return sid+" "+sname;
	}
}

class Course{
	
	int cid;
	String cname;
	Student2 stud;
	
	public Course(int cid, String cname, Student2 stud)
	{
		this.cid = cid;
		this.cname = cname;
		this.stud = stud;
	}
	
	public String toString()
	{
		return cid+" "+cname+" "+stud;
	}
}

public class ArrayObject3 {

	public static void main(String[] args) {

		Course c[] = new Course[3];
		
//		c[0] = new Course(101,"Shiv",new Student(102, "Jay"));			// Another way
		
		Scanner sc = new Scanner(System.in);
			
		for(int i = 0; i < c.length; i++)
		{
			System.out.println("Enter the Course id");
			int cid = sc.nextInt();
			System.out.println("Enter the Course Name");
			String cname = sc.next();
			System.out.println("Enter the Student id");
			int sid = sc.nextInt();
			System.out.println("Enter the Student Name");
			String sname = sc.next();
			
			Student2 s = new Student2(sid, sname);
			
			c[i] = new Course(cid, cname, s);				// 1st Way
		
//			c[i] = new Course(cid, cname, new Student(sid, sname));		// 2nd Way
		}
		
		System.out.println("------------------------------------");
		for(int i = 0; i < c.length; i++)
		{
			System.out.println(c[i]);
		}
	}
}
