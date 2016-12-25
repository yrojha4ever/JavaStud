package org.javastud.studm.oop_slide2.inheritence;

public class Car extends Vehicle {

	private int gears;
	private int speed;

	public void printCar() {
		super.printVehicle();
		System.out.println("Gears: " + gears);
		System.out.println("Speed: " + speed);
	}

	public static void main(String[] args) {
		Car ford = new Car();
		ford.setWheel("Four");
		ford.color = "Orange";
		ford.cc = 1500;

		ford.gears = 5;
		ford.speed = 250;

		ford.printCar();
	}

}
