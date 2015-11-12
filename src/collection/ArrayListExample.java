package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main( String[] args ) {

		List< String > countryList = new LinkedList< String >( );
		countryList.add( "Nepal" );
		countryList.add( "China" );
		countryList.add( "USA" );
		countryList.add( "Japan" );

		if ( countryList.contains( "Japan" ) ) {
			System.out.println( "Yes there is Japan." );
		}

		// Iterator can be used to traverse.
		Iterator< String > itr = countryList.iterator( );
		while ( itr.hasNext( ) ) {
			String s = itr.next( );
			System.out.println( s );

			// we can remove elements inside iterator.
			if ( s.equals( "China" ) ) {
				itr.remove( );
			}
		}

		countryList.remove( 2 );
		String npl = countryList.get( 0 );

		System.out.println( "No of elments left: " + countryList.size( ) );
		// Foreach: display purpose
		for ( String s: countryList ) {
			System.out.println( s );
		}

		for ( int i = 0; i < countryList.size( ); i++ ) {
			String s = countryList.get( i );
			countryList.remove( i );
			System.out.println( s );
		}

		countryList.clear( );
		System.out.println( countryList.isEmpty( ) );

	}
}
