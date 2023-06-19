package com.ArrayObject;

import java.util.*;

class Movie{

	int mid;
	String mname;
	String actorname[];
	
	Movie(int mid, String mname, String actorname[])
	{
		this.mid = mid;
		this.mname = mname;
		this.actorname = actorname;
	}
	
	public String toString()
	{
		return mid+" "+mname+" "+Arrays.toString(actorname);
	}
}

public class ArrayObject6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Movie m[] = new Movie[2];
		
		for(int i = 0; i < m.length; i++)
		{
			System.out.println("Enter Movie ID");
			int id = sc.nextInt();
			System.out.println("Enter Movie Name");
			String name = sc.next();
			
			System.out.println("Enter Actors name");
			String ma[] = new String[2];
			for(int j = 0; j < ma.length; j++)
			{
				ma[j] = sc.next();
			}
			
			m[i] = new Movie(id, name, ma);
		}
		
		System.out.println("-----------------------------------");
		for(int i = 0; i < m.length; i++)
		{
			System.out.println(m[i]);
		}
	}
}
