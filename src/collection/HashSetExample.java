package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main( String[] args ) {

		HashSet< String > countryset = new HashSet< String >( );

		countryset.add( "Nepal" );
		countryset.add( "China" );
		countryset.add( "Nepal" );
		countryset.add( "Japan" );
		countryset.add( "USA" );

		Iterator< String > itr = countryset.iterator( );
		while ( itr.hasNext( ) ) {
			System.out.println( itr.next( ) );
		}

		countryset.remove( "Japan" );

		System.out.println( "********" );
		for ( String country: countryset ) {
			System.out.println( country );
		}
	}
}
