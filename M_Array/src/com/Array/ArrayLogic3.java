// Array Program to Find Maximum by (Char type)

package com.Array;

import java.util.*;

public class ArrayLogic3 {
	
	public void findMax(char ch[])
	{
		char maxChar = ch[0];
		char minChar = ch[0];
		
		for(int i = 0; i < ch.length; i++)
		{
			if(maxChar < ch[i])
			{
				maxChar = ch[i];
			}
			
			if(minChar > ch[i])
			{
				minChar = ch[i];
			}
		}
		
		System.out.println("Maximum element is : "+maxChar);
		System.out.println("Minimum element is : "+minChar);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayLogic3 al = new ArrayLogic3();
		
		//char ch[] = {'z','c','i','o','d','r'};
		
		char ch[] = new char[5];
		
		System.out.println("Enter the Character Elements");
		for(int i = 0; i < ch.length; i++)
		{
			ch[i] = sc.next().charAt(0);
		}
		
		System.out.println("--------------------------------------");
		al.findMax(ch);
		
	}

}
