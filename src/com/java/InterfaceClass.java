package com.java;

public class InterfaceClass implements College, University{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		College ic =new InterfaceClass();
		ic.BSC();
		ic.BTech();
		
		University un = new InterfaceClass();
		un.JNTUH();
		un.JNTUK();
		
		InterfaceClass on = new InterfaceClass();
		on.AcharyaUniversity();
	}

	@Override
	public void BTech() {
		// TODO Auto-generated method stub
		System.out.println("It is the 4 years of course");
	}

	@Override
	public void BSC() {
		// TODO Auto-generated method stub
		System.out.println("It is the 3 years of course");
	}

	@Override
	public void MCA() {
		// TODO Auto-generated method stub
		System.out.println("It is the 2.5 years of course");
	}

	@Override
	public void JNTUK() {
		// TODO Auto-generated method stub
		System.out.println("It is located in Kakinada");
	}

	@Override
	public void JNTUH() {
		// TODO Auto-generated method stub
		System.out.println("It is located in Hyderabad");
	}
	
	public void AcharyaUniversity()
	{
		System.out.println("It is located in Guntur");
	}
	
	

}
