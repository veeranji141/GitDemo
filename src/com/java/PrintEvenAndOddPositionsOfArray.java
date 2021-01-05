package com.java;

public class PrintEvenAndOddPositionsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {5,6,2,3,8,4,7};
		int count=0;
		int sum=0;
		
		// Elements of given array present on even position	
		System.out.println("Elements of given array present on odd position: ");
		for(int i=0; i<arr.length; i=i+2)
		{
			System.out.println(arr[i]);
		}
		
		// Elements of given array present on even position
		System.out.println("Elements of given array present on even position: ");
		for(int i=1; i<arr.length; i=i+2)
		{
			System.out.println(arr[i]);
		}
		
		// Number of elements are present in an array
		for(int i=0; i<arr.length; i++)
		{
			count=count+1;
		}
		
		System.out.println("Number of elements are present in an array: "+count);
		
		// sum of all the items of the array
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+i;
		}
		
		System.out.println("sum of all the items of the array: "+sum);

	}

}
