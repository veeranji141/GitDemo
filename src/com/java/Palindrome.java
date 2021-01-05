package com.java;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "racecar";
		String t = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			t=t+s.charAt(i);
			
	
		}
		System.out.println(t);
		
		if(s.equalsIgnoreCase(t)) {
			
			System.out.println("It is a pallindrome");
		}
		else {
			System.out.println("It is not a pallindrome");
		}
	}

}
