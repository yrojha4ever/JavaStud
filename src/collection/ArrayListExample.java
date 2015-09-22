package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main( String[] args ) {

		List< String > countryList = new ArrayList< String >( );
		countryList.add( "Nepal" );
		countryList.add( "China" );
		countryList.add( "USA" );
		countryList.add( "Japan" );

		Iterator< String > itr = countryList.iterator( );// getting Iterator to traverse elements
		while ( itr.hasNext( ) ) {
			String country = itr.next( );
			System.out.println( country );
			if ( country.equals( "Japan" ) ) {
				itr.remove( );
			}
		}

		countryList.remove( 1 );

		System.out.println( "***********" );
		for ( String country: countryList ) {
			System.out.println( country );
		}

	}
}
