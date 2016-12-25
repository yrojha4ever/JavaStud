package org.javastud.studm.wrapper;

public class WrapperClass {
	public static void main(String[] args) {

		//boolean, int, long, double, float
		// Boolean Integer Long Double Float: Wrapper class
		boolean b = true;
		Boolean b1 = true;
		
		//No1: Convert string to int
		String s= "45";
		//int i = s; //ERROR
				
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		//No2: Convert to other number system
		System.out.println(Integer.toHexString(123));
		System.out.println(Integer.toBinaryString(123));
		
		//No3:Casting operation.
		Integer ii = 55;
		Double d = ii.doubleValue();
		Long l = d.longValue(); // (long)d;
		
		
		Float f = new Float("98.6f"); //"98.6f"
		System.out.println(f.intValue());
		
	}
}
