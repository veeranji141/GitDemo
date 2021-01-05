package com.java;

public class CopyofAllElementsIntoAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int [] {5,6,7};
		
		int b[] = new int [a.length];
		
		for(int i=0; i<a.length; i++)
		{
			b[i] = a[i];		
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		for(int j=0; j<b.length; j++)
		{
			System.out.print(b[j]+ " ");
		}
	}
	

}
