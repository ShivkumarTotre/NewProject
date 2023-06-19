package com.Array2D;

import java.util.*;

public class CreationTwoD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};			// 1st Way
		
		int brr[][] = new int[2][2];						// 2nd Way
//		brr[0][0] = 4;
//		brr[0][1] = 8;
//		brr[1][0] = 15;
//		brr[1][1] = 2;
		
		System.out.println("Enter the Array Elements");
		
		for(int i = 0; i < brr.length; i++)
		{
			for(int j = 0; j < brr.length; j++)
			{
				brr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("------------------------------------");
		
		for(int i = 0; i < brr.length; i++)
		{
			for(int j = 0; j < brr.length; j++)
			{
				System.out.print(brr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------");
		
		for(int s[] : brr)
		{
			for(int e : s)
			{
				System.out.print(e+" ");
			}
			System.out.println();
		}
	}

}
