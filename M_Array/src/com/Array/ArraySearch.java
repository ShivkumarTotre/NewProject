// Array Program which Searchs Element is Present or Not

package com.Array;

import java.util.*;

public class ArraySearch {
	
	public void search(int b[], int iValue)
	{
		boolean bo = false;
		
		for(int i = 0; i < b.length; i++)
		{
			if(iValue == b[i])
			{
				bo = true;
			}
		}
		
		if(bo == true)
		{
			System.out.println("Number is Present");
		}
		else
		{
			System.out.println("Number is Not Present");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArraySearch as = new ArraySearch();
		
		int a[] = {3,8,6,1};
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("Enter the Number to Search");
		
		int iNo = sc.nextInt();
		
		as.search(a, iNo);
		
	}

}
