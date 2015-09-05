package oop.finalex;

public class FinalParam {

	private double area = 0.0;

	public void area(final double PI, double r) {
		area = PI * r * r;

		PI = 2.5;

		System.out.println(area);
	}

	public static void main(String[] args) {
		FinalParam obj = new FinalParam();
		obj.area(Math.PI, 2);
	}

}
