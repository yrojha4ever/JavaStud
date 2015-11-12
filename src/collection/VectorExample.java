package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	public static void main( String[] args ) {

		Vector< String > vec = new Vector< String >( );

		/* Adding elements to a vector */
		vec.addElement( "Apple" );
		vec.addElement( "Orange" );
		vec.addElement( "Mango" );
		vec.addElement( "Fig" );

		System.out.println( "Size is: " + vec.size( ) );

		/* Display Vector elements */
		Enumeration< String > en = vec.elements( );
		System.out.println( "\nElements are:" );
		while ( en.hasMoreElements( ) ) {
			System.out.print( en.nextElement( ) + " " );
		}

	}

}
