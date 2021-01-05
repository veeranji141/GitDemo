package com.java;

public class AccessModifiers {
	
	int i;
	int j;
	int k;
	 protected int addition(int i, int j)
	{
		k=i+j;
		System.out.println(k);
		return k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AccessModifiers am = new AccessModifiers();
		
		am.addition(10, 23);
	}

}
