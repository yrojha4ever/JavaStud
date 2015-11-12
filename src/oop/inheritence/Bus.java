package oop.inheritence;

public class Bus extends Vehicle {
	private int	cc;
	private int	gears;

	public Bus( String color, int speed, int size, int cc, int gears ) {
		super( color, speed, size );
		this.cc = cc;
		this.gears = gears;
	}

	public void attributesBus( ) {
		System.out.println( "Color : " + super.getColor( ) );
		System.out.println( "Speed : " + super.speed );
		System.out.println( "Size : " + super.size );

		System.out.println( "CC: " + this.cc );
		System.out.println( "Gears: " + this.gears );
	}

	public static void main( String[] args ) {
		Bus b = new Bus( "RED", 100, 500, 150, 5 );
		b.attributesBus( );

		b.setColor( "GREEEN" );
		b.attributesBus( );

	}
}
