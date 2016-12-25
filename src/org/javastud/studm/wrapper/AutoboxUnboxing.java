package org.javastud.studm.wrapper;

public class AutoboxUnboxing {
	public static void main(String[] args) {
		//autoboxing
		Integer x = 50; //new Integer(50);
		int y = 50;
		Integer z = new Integer(50);
		
		//Auto unBoxing
		Integer i = new Integer(75);
		int r = i;
		
		int sum = x + y + z + i + r;
		System.out.println(sum);
		
		Boolean b = true;
		
		Character c = 'X';
		char cc = 'X';
		
		
		
		Double d = 55.5;
		double dd = 55.5;
		System.out.println(d.intValue());
		
		//No any dot operation in primitive data type
		//System.out.println(dd.intValue());
		
	}
}
