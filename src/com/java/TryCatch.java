package com.java;

public class TryCatch {
	int i=50;
	int j=0;
	int k;
	
	public void division()
	{
		try {
		k=i/j;
		System.out.println(k);
		}
	
		catch(ArithmeticException e)
		{
			k=i/(j+2);
			System.out.println(k);
		}
		System.out.println("rest of the code"); 
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TryCatch tc = new TryCatch();
		tc.division();
		

	}

}
