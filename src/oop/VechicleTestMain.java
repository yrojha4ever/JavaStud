package oop;

import oop.inheritence.Vehicle;

public class VechicleTestMain extends Vehicle {
	public static void main(String[] args) {
		VechicleTestMain v = new VechicleTestMain();
		System.out.println(v.speed);
		System.out.println(v.size);
	}
}
