// Array Program to Perform Addition

package com.Array;

public class ArrayLogic2 {
	
	public static void addition(int b[])
	{
		int iSum = 0;
		
		for(int i = 0; i < b.length; i++)
		{
			iSum = iSum + b[i];
		}
		
		System.out.println("Addition is : "+iSum);
	}

	public static void main(String[] args) {

		int a[] = {6,2,-3,7,0,8};
		
		addition(a);
	}

}
