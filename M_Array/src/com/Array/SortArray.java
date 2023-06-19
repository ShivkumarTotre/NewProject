// Array Program which sorts the array

package com.Array;

import java.util.Arrays;

public class SortArray {
	
	public void sortingChar(char c[])
	{
		for(int i = 0; i < c.length; i++)
		{
			char temp = 0;
			
			for(int j = 0; j < c.length; j++)
			{
				if(c[i] < c[j])
				{
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		
		System.out.println("After Sorting Array : \n"+Arrays.toString(c));
	}

	public static void main(String[] args) {

		SortArray sa = new SortArray();
		
		char ch[] = {'s','i','d','z','a','p'};
		
		System.out.println(Arrays.toString(ch));
		System.out.println("-----------------------------------------------");
		
		sa.sortingChar(ch);
	}

}
