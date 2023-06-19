package com.ArrayObject;

import java.util.*;

class Department
{
	private int did;
	private String dname;
	private String dlocation;
	
	public void setId(int did)
	{
		this.did = did;
	}
	public void setName(String dname)
	{
		this.dname = dname;
	}
	public void setLocation(String dlocation)
	{
		this.dlocation = dlocation;
	}
	
	public int getId()
	{
		return this.did;
	}
	public String getName()
	{
		return this.dname;
	}
	public String getLocation()
	{
		return this.dlocation;
	}
	
	public String toString()
	{
		return did+" "+dname+" "+dlocation;
	}
}

public class ArrayObject4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Department d[] = new Department[3];
		
		for(int i = 0; i < d.length; i++)
		{
			System.out.println("Enter Department id");
			int sid = sc.nextInt();
			System.out.println("Enter Department name");
			String sname = sc.next();
			System.out.println("Enter Department Location");
			String slocation = sc.next();
			
			d[i] = new Department();						// 1st way
			d[i].setId(sid);
			d[i].setName(sname);
			d[i].setLocation(slocation);
			
//			Department dept = new Department();				// 2nd way
//			dept.setId(sid);
//			dept.setName(sname);
//			dept.setLocation(slocation);
//			
//			d[i] = dept;	
		}
		
		System.out.println("-------------------------------------------");
		for(int i = 0; i < d.length; i++)
		{
			System.out.println(d[i].getId()+" "+d[i].getName()+" "+d[i].getLocation());
		}
	}
}
