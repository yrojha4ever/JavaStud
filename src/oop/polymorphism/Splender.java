package oop.polymorphism;

public class Splender extends Bike {

	@Override
	public void run() {
		System.out.println("Running Splender Bike.");
	}

	public static void main(String[] args) {
		Bike b = new Splender(); //upcasting
		b.run();
	}

}
