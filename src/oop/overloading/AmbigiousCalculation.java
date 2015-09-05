package oop.overloading;

public class AmbigiousCalculation {
	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");
	}

	public static void main(String args[]) {
		AmbigiousCalculation obj = new AmbigiousCalculation();
		obj.sum(20, 20);// now ambiguity
	}

}
