package com.java;

public class LoopsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Print numbers from 1 t0 30
		
		/*for(int i=0; i<30; i++)
		{
			System.out.println(i);
		}*/
		
		/*int i=0;
		while(i<30) 
		{
		System.out.println(i);	
		i++;
		}*/
		
		/*int i=0;
		
		do {
			System.out.println(i);
			i=i+2;
		}
		
		while(i<30);	*/
		int k=1;
		for(int i=0; i<=4; i++)
		{
			for(int j=1; j<=4-i; j++)
			{
				System.out.print(k);
				//System.out.print("\t");
				k++;
				System.out.print("\t");
			}
			System.out.println(" ");
		}
	
	int m=0;
	for(int i=1; i<4; i++)
		
		{
			for(int j=1; j<=i; j++)
			{
				m=m+3;
				System.out.print(m);
				System.out.print("\t");
				
			}
			System.out.println(" ");
		}
	}
	

}
