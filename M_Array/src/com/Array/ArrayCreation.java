// Basic Array Program by 2 Ways 

package com.Array;

import java.util.*;

public class ArrayCreation {

	public static void main(String[] args) {

		// 1 Way : Using Hardcoded 
		int no = 10;
		
		int arr[] = {7,9,2,4};
		
		int brr[] = new int[5];

		brr[0] = 45;
		brr[1] = 78;
		brr[2] = 12;
		brr[3] = 23;
		brr[4] = 33;
		
		// 2nd Way : Using Input from user
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int [5];
		
		System.out.println("Enter the Array Elements");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Elements from Array");
		for(int i = 0; i < a.length; i++)				// Using Traditional For Loop
		{
			System.out.println(a[i]);
			//System.out.println(a);
		}
		
		System.out.println("------------------------------------------");
		for(int j : a)									// Using Enhanced For Loop
		{
			System.out.println(j);
		}
	}

}
