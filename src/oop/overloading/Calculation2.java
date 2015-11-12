package oop.overloading;

public class Calculation2 {

	int sum( int a, int b ) {
		return ( a + b );
	}

	int sum( double a, double b ) {
		int r = ( int ) ( a + b );
		return r;
	}

	int sum( String a, String b ) {
		int r = Integer.valueOf( a ) + Integer.valueOf( b );
		return r;
	}

	public static void main( String args[] ) {
		Calculation2 obj = new Calculation2( );
		int r = obj.sum( 10.5, 10.5 );
		System.out.println( r );

		System.out.println( obj.sum( 10.5, 10.5 ) );

		System.out.println( obj.sum( "55", "44" ) );

		System.out.println( obj.sum( 100, 100 ) );

	}

}
