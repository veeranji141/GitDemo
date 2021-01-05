package com.java;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] {2,3,4,5,2,4,6,8,6};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(" "+arr[j]);
				}
			}
		}		
	}

}
