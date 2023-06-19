package com.Array2D;

public class TwoDArrayDemo {
	
	public static void rowSum(int a[][])
	{
		for(int i = 0; i < a.length; i++)
		{
			int iSum = 0;
			for(int j = 0; j < a[i].length; j++)
			{
				iSum = iSum + a[i][j];
				System.out.print(a[i][j]+" ");
			}
			
			System.out.print(" Sum is : "+iSum);
			System.out.println();
		}
	}
	
	public static void maxRowsValue(int b[][])
	{
		System.out.println("-------------------------------------");
		
		for(int i = 0; i < b.length; i++)
		{
			int iMax = b[i][0];
			for(int j = 0; j < b[i].length; j++)
			{
				if(iMax < b[i][j])
				{
					iMax = b[i][j];
				}
			}
			
			System.out.println(iMax);
		}
	}

	public static void main(String[] args) {
		int arr[][] = {{3,4,6},{8,5,1},{1,4,5}};
		
		TwoDArrayDemo.rowSum(arr);
		TwoDArrayDemo.maxRowsValue(arr);
	}

}
