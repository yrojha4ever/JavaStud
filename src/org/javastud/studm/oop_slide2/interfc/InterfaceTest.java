package org.javastud.studm.oop_slide2.interfc;

public class InterfaceTest {
	public static void main(String[] args) {
		
		//Cant create object of interface
		//Bank iBank = new Bank();
		
		Bank nbl = new Nabil();
		
		NTC nblNtc = new Nabil();
		
		Nabil n = new Nabil();
		
		
		Bank nibl = new NIBL();
		
		
		StringBuilder sb = new StringBuilder("JAVA");
		sb.append("WORLD");
		sb.reverse();
		System.out.println(sb);
		
	}
}
