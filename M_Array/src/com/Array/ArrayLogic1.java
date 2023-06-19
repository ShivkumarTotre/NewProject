// Array Program to Find Even Elements

package com.Array;

import java.util.*;

public class ArrayLogic1 {
	
	public void findEven(int brr[])
	{
		System.out.println("Even Elements from Array");
		
		for(int i = 0; i < brr.length; i++)
		{
			if(brr[i] % 2 == 0)
			{
				System.out.println(brr[i]);
			}
		}
		
		System.out.println("----------------------------");
		for(int j : brr)
		{
			if(j % 2 == 0)
			{
				System.out.println(j);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayLogic1 al = new ArrayLogic1();
		
		int arr[] = new int[5];
		
		System.out.println("Enter the Elements");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		al.findEven(arr);
	}

}
