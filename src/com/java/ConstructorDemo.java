package com.java;

public class ConstructorDemo {
	int id;
	int number;
	public ConstructorDemo() 
	{
		System.out.println("I am in default Constructor");
	}
	
	public ConstructorDemo(int i,int j)
	
	{
		id=i;
		number =j;
		System.out.println("I am in Parameterized Constructor");
		
	}
	
	void Display()
	{
		
	System.out.println(id+" "+number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo(6,7);
		cd1.Display();

	}

}
