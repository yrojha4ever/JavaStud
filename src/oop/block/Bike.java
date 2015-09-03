package oop.block;

public class Bike {

	private int speed;

	public Bike() {
		System.out.println("Constrctor: " + speed);
	}

	{
		speed = 100;
		System.out.println("Block: " + speed);
	}

	public static void main(String[] args) {
		Bike bike = new Bike();
	}

}
