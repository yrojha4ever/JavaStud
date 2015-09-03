package oop.superex;

public class Bike extends Vehicle {

	int speed = 100; // Km/Hour

	public void displaySpeed() {
		System.out.println("Bike Speed: " + speed);
		System.out.println("Vehicle Speed: " + super.speed);
	}

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.displaySpeed();
	}

}
