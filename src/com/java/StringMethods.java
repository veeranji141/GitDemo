package com.java;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				String a= " javatraining";//string 

				System.out.println(a.charAt(2));
				System.out.println(a.indexOf("z"));
				System.out.println(a.substring(3, 6));
				System.out.println(a.substring(5));
				System.out.println(a.concat("rahul teaches"));
				System.out.println(a.length());
				System.out.println(a.trim());
				System.out.println(a.toUpperCase());
				System.out.println(a.toLowerCase());
				//split
				String arr[]=a.split("t");
				System.out.println(arr[0]);
				System.out.println(arr[1]);
				System.out.println(a.replace("t", "s"));
			}


		
	}

		

	


