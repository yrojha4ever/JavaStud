package oop.inheritence;

public class Car extends Vehicle {
	private int	cc;
	private int	gears;

	public void attributesCar( ) {
		System.out.println( "Color : " + getColor( ) );
		System.out.println( "Speed : " + speed ); // super.speed or speed
		System.out.println( "Size : " + size );

		System.out.println( "CC: " + this.cc ); // this.cc or cc
		System.out.println( "Gears: " + gears );
	}

	public static void main( String[] args ) {
		Car c1 = new Car( );
		c1.cc = 1000;
		c1.gears = 5;
		c1.setVehicleProp( "RED", 80, 500 );

		c1.attributesCar( );

		System.out.println( c1.getColor( ) );
	}
}
