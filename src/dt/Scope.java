package dt;

public class Scope {
	public static void main( String[] args ) {
		int x; // known to all code within main
		x = 10;
		if ( x == 10 ) { // start new scope
			int y = 20; // known only to this block

			// x and y both known here.
			System.out.println( "x and y: " + x + " " + y );

			x = y * 2;
		}

		// y = 100

		System.out.println( "x is: " + x );

		if ( 30 > 40 ) {
			System.out.println( "10 is greater then 9" );
		} else {
			System.out.println( "10 is not greatr then 9" );
		}

	}
}
