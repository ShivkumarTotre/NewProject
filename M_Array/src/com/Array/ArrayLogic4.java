// Array Program of ToggleCase

package com.Array;

import java.util.Arrays;

public class ArrayLogic4 {
	
	public void toggleCase(char c[])
	{
		for(int i = 0; i < c.length; i++)
		{
			if((c[i] >= 'a') && (c[i] <= 'z'))
			{
				c[i] = (char)(c[i]-32);
			}
			else if((c[i] >= 'A') && (c[i] <= 'Z'))
			{
				c[i] = (char)(c[i]+32);
			}
			else
			{
				c[i] = c[i];
			}
		}
		
		System.out.println(Arrays.toString(c));
	}

	public static void main(String[] args) {

		ArrayLogic4 al = new ArrayLogic4();
		
		char ch1[] = {'z','p','a','i','M','Q','B','&'};
		
		System.out.println(Arrays.toString(ch1));
		System.out.println("-----------------------------");
		
		al.toggleCase(ch1);
	}

}
