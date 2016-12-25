package org.javastud.studm.oop_slide2.finl;

public class Area {

	public void showArea(final double pi, final double r) {
		//pi = 110.2;
		final double a = pi * r * r;
		
		//a = 10.5;
		
		System.out.println("Area: " + a);
	}

	public static void main(String[] args) {
		final Area ar = new Area(); //1000x
		ar.showArea(3.14, 4);
		
		//ar = new Area(); //2000x
		
		Area ar2 = new Area();
	}
}
