// Array Program of Object

package com.ArrayObject;

import java.util.*;

class Employee{

	int sid;
	String sname;
	int salary;
	
	public Employee(int sid, String sname, int salary)
	{
		this.sid = sid;
		this.sname = sname;
		this.salary = salary;
	}
	
	public String toString()
	{
		return sid+" "+sname+" "+salary;
	}
}

public class ArrayObject2 {

	public static void main(String[] args) {

		Employee e[] = new Employee[3];
		Scanner sc = new Scanner(System.in);
			
		for(int i = 0; i < e.length; i++)
		{
			System.out.println("Enter the id");
			int id = sc.nextInt();
			System.out.println("Enter the Name");
			String s1 = sc.next();
			System.out.println("Enter the Salary");
			int s = sc.nextInt();
			
//			Employee e1 = new Employee(id, s1, s);			// 1st Way
//			e[i] = e1;
			
			e[i] = new Employee(id, s1, s);					// 2nd Way
		}
		
		for(int i = 0; i < e.length; i++)				// Using Traditional loop
		{
			System.out.println("Employee whose Salary greater than 20K are : ");
		
			if(e[i].salary > 20000)
			{
				System.out.println(e[i].sid+" "+e[i].sname+" "+e[i].salary);
			}
		}
		
		System.out.println("------------------------------------");
		for(Employee s1 : e)							// Using Enhance for loop
		{
			System.out.println(s1);
		}
	}
}

