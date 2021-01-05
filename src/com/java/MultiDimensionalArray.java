package com.java;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][] = {{5,6,9},{1,80,27},{4,1,7}};
		int min = a[0][0];
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(a[i][j]>min)	// to print max value, for min value (a[i][j])
					
				{
					min=a[i][j];
				}
			}
				
		}
		System.out.println(min);
	}

}
