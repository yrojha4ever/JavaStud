package org.javastud.studm.oop_slide2.override_super;

public class Vehicle {
	
	protected int speed = 150;
	
	/*public Vehicle(){
	}*/

	public Vehicle(String s) {
		System.out.println("**Super constructor**" + s);
	}

	public void run() {
		System.out.println("Vehicle is running.");
	}

}
