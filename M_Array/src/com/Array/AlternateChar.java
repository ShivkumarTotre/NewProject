// Array Program which alternates character by its consecutive

package com.Array;

import java.util.*;

public class AlternateChar {

	public static void replaceAlt(char b[])
	{
		for(int i = 0; i < b.length; i++)
		{
			if(((b[i] >= 'a') && (b[i] <= 'x')) || ((b[i] >= 'A') && (b[i] <= 'X')))
			{
				b[i] = (char)(b[i]+2);
			}
			else if(((b[i] >= 'y') && (b[i] <= 'z')) || ((b[i] >= 'Y') && (b[i] <= 'Z')))
			{
				b[i] = (char)(b[i]-24);
			}
		}
		
		System.out.println(Arrays.toString(b));
	}
	
	public static void main(String[] args) {

		char ch[] = {'z','a','p','i','s','g'};
		
		System.out.println(Arrays.toString(ch));
		//System.out.println("After Alternating by 2");
		System.out.println("--------------------------------------");
		
		replaceAlt(ch);
		
	}

}
