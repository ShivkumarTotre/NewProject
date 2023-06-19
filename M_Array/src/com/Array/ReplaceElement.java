// Array Program which Replace -ve Element by square of adjacent element 

package com.Array;

import java.util.*;

public class ReplaceElement {
	
	public void replace(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] < 0)
			{
				a[i] = a[i+1]*a[i+1];
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {

		ReplaceElement re = new ReplaceElement();
		
		int c[] = {3,-2,5,9,-7,1};
		
		System.out.println(Arrays.toString(c));
		
		re.replace(c);
	}

}
