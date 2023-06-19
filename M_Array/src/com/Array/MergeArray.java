// Array Program of Merging with removing duplicate elements

package com.Array;

import java.util.Arrays;

public class MergeArray {
	
	public void mergeArray(int a1[], int b1[], int c1[])
	{
		int k = 0;
		
		for(int i = 0; i < a1.length; i++)
		{
			c1[k] = a1[i];
			k++;
		}
		
		for(int i = 0; i < b1.length; i++)
		{
			boolean isVisited = false;
			
			for(int j = k-1; j >= 0; j--)
			{
				if(b1[i] == c1[j])
				{
					isVisited = true;
					break;
				}
			}
			
			if(isVisited == false)
			{
				c1[k] = b1[i];
				k++;
			}
		}
		
		System.out.println(Arrays.toString(c1));
	}

	public static void main(String[] args) {

		MergeArray ma = new MergeArray();
		
		int a[] = {13,45,33,78};
		int b[] = {30,13,76,99};
		
		int c[] = new int [a.length + b.length];
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		ma.mergeArray(a, b, c);
		
	}

}
