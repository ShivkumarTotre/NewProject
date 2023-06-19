package com.ArrayObject;

import java.util.Scanner;

class Order
{
	private int oid;
	private String oname;
	private int cust_id;
	
	public void setId(int oid)
	{
		this.oid = oid;
	}
	public void setName(String oname)
	{
		this.oname = oname;
	}
	public void setLocation(int cust_id)
	{
		this.cust_id = cust_id;
	}
	
	public int getId()
	{
		return this.oid;
	}
	public String getName()
	{
		return this.oname;
	}
	public int getCustId()
	{
		return this.cust_id;
	}
	
	public String toString()
	{
		return oid+" "+oname+" "+cust_id;
	}
}

class Shipment{
	int sid;
	Order o;
	
	public void setId(int sid)
	{
		this.sid = sid;
	}
	public void setOrder(Order o)
	{
		this.o = o;
	}
	
	public int getId()
	{
		return sid;
	}
	public Order getO()
	{
		return o;
	}
}



public class ArrayObject5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Shipment s[] = new Shipment[2];
		
		for(int i = 0; i < s.length; i++)
		{
			System.out.println("Enter Shipment id");
			int sid = sc.nextInt();
			System.out.println("Enter Order id");
			int oid = sc.nextInt();
			System.out.println("Enter Order name");
			String oname = sc.next();
			System.out.println("Enter Cust id");
			int cust = sc.nextInt();
			
			Shipment sm = new Shipment();
			sm.setId(sid);
			sm.setOrder(new Order());
			sm.getO().setId(oid);
			sm.getO().setName(oname);
			sm.getO().setLocation(cust);
			
			s[i] = sm;	
		}
		
		System.out.println("-------------------------------------------");
		for(int i = 0; i < s.length; i++)
		{
			System.out.println(s[i].getId());
			System.out.println(s[i].getO().getId());
			System.out.println(s[i].getO().getName());
			System.out.println(s[i].getO().getCustId());
		}
		
		System.out.println("-------------------------------------------");
		for(Shipment s1 : s)
		{
			System.out.println(s1.getId()+" "+s1.getO().getId()+" "+s1.getO().getName()+" "+s1.getO().getCustId());
		}
	}
}