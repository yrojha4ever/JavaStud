package oop.inheritence;

public class Vehicle {

	private String color;
	public int speed;
	protected int size;

	protected void attributes() { //public or protected.
		System.out.println("Color : " + color);
		System.out.println("Speed : " + speed);
		System.out.println("Size : " + size);
	}

}



//public void attributesCar() {
//	// The subclass refers to the members of the superclass
//
//	// System.out.println("Color of Car : " + color); //ERROR:private
//	// field:color
//
//	System.out.println("Speed of Car : " + super.speed); // super.speed or
//															// speed
//
//	System.out.println("Size of Car : " + size);
//
//	System.out.println("CC of Car : " + cc);
//	System.out.println("No of gears of Car : " + gears);
//
//	super.attributes(); // WE CAN USE Super in any non static method.
//}