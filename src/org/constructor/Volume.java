package org.constructor;

public class Volume {
	int length;
	int breadth;
	int height;

	// Default Constructor
	public Volume() {
	}

	// Constructor overloading
	// Parameterized Constructor
	Volume(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	// Method
	void showVolume() {
		int vol = this.length * this.breadth * this.height;
		System.out.println("Volume: " + vol);
	}

	void showArea() {
		int area = length * breadth;
		System.out.println("Area: " + area);
	}

}
