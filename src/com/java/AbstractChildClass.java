package com.java;

public class AbstractChildClass extends AbstractParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractChildClass ac = new AbstractChildClass();
		ac.chemistry();
		ac.mathmatics();
		ac.physics();

	}
	

	@Override
	public void chemistry() {
		// TODO Auto-generated method stub
		System.out.println("He scored 70 marks");
	}

}
