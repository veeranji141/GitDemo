package com.java;

public class StaticAndNonStatic {
	
	int rollNumber;
	String name;
	static String college="Global Institute";
	
	public StaticAndNonStatic(int rollNumber,String name)
	{
		this.rollNumber=rollNumber;
		this.name=name;	
	}
	public void getData()
	{
		System.out.println(rollNumber+ " " +name+ " " +college);
	}
	
	public static void address()
	
	{
		college="Sri Chaitanaya"; // Changing the static variable
		System.out.println(college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticAndNonStatic s1 = new StaticAndNonStatic(1,"veera");
		StaticAndNonStatic s2 = new StaticAndNonStatic(2,"Anji");
		StaticAndNonStatic s3 = new StaticAndNonStatic(3,"Rama");
		
		s1.getData();
		s2.getData();
		s3.getData();  
		StaticAndNonStatic.address();    // Calling the static method with class name

	}

}
