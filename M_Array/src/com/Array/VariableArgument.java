package com.Array;

public class VariableArgument {

	void show(String str, int... a)
	{
		int len = a.length;
		
//		System.out.println(a[len-1]);
		
		for(int s : a)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {

		VariableArgument va = new VariableArgument();
		
		va.show("Pune", 10);
		System.out.println("-------------------------");
		va.show("Mumbai", 1, 4, 6, 2);
		System.out.println("-------------------------");
		va.show("Nashik", 3, 4);
		System.out.println("-------------------------");
	}
}
