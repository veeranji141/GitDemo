package com.java;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(6);
		a.add(0,8);
		a.add(7);
		a.add(3,9);
		System.out.println(a.get(0));
		System.out.println(a.indexOf(9));
		System.out.println(a.isEmpty());
		System.out.println(a.contains(10));
		a.remove(2);
		System.out.println(a);
		
		System.out.println(a.size());
		
		
		

	}

}
