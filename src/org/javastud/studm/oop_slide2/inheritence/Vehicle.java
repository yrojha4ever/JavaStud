package org.javastud.studm.oop_slide2.inheritence;

public class Vehicle {
	private String wheel;
	public String color;
	protected int cc;

	protected void printVehicle() {
		System.out.println("Wheel: " + getWheel());
		System.out.println("Color: " + color);
		System.out.println("Cc: " + cc);
	}

	public String getWheel() {
		return wheel;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

}
