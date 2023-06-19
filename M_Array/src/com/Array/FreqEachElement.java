// Array Program which Count Frequency of Element

package com.Array;

import java.util.*;

public class FreqEachElement {
	
	public void findFrequency(int c[])
	{	
		for(int i = 0; i < c.length; i++)
		{
			int iCnt = 1;
			boolean isVisited = false;
			
			for(int k = i-1; k >= 0; k--)
			{
				if(c[k] == c[i])
				{
					isVisited = true;
					break;
				}
			}
			
			if(isVisited == false)
			{
				for(int j = i+1; j < c.length; j++)
				{
					if(c[j] == c[i])
					{
						iCnt++;
					}
				}
				
				if(iCnt > 1)
				{
					System.out.println(c[i]+" Occurs : "+iCnt+" times");
				}
				else
				{
					System.out.println(c[i]+" Occurs : "+iCnt+" times");
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		FreqEachElement fe = new FreqEachElement();
		
		int arr[] = new int[7];
		
		System.out.println("Enter Elements");
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		fe.findFrequency(arr);
	}

}
