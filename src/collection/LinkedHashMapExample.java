package collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapExample {
	public static void main( String[] args ) {

		// HashMap Declaration
		LinkedHashMap< Integer, String > lhmap = new LinkedHashMap< Integer, String >( );

		// Adding elements to LinkedHashMap
		lhmap.put( 22, "Core Java" );
		lhmap.put( 33, "Adv Java" );
		lhmap.put( 1, "Spring" );
		lhmap.put( 2, "Hibernate" );
		lhmap.put( 100, "Maven" );

		// Generating a Set of entries
		Set< Entry< Integer, String > > set = lhmap.entrySet( );

		// Displaying elements of LinkedHashMap
		Iterator< Entry< Integer, String > > iterator = set.iterator( );
		while ( iterator.hasNext( ) ) {
			Map.Entry< Integer, String > me = iterator.next( );
			System.out.print( "Key is: " + me.getKey( ) + "& Value is: " + me.getValue( ) + "\n" );
		}
	}
}
