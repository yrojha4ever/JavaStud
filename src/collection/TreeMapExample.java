package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main( String[] args ) {

		/* This is how to declare TreeMap */
		TreeMap< Integer, String > tmap = new TreeMap< Integer, String >( );

		/* Adding elements to TreeMap */
		tmap.put( 1, "Core Java" );
		tmap.put( 23, "Adv Java" );
		tmap.put( 70, "Spring" );
		tmap.put( 4, "Hibernate" );
		tmap.put( 2, "Maven" );

		/* Display content using Iterator */
		Set set = tmap.entrySet( );
		Iterator iterator = set.iterator( );
		while ( iterator.hasNext( ) ) {
			Map.Entry mentry = ( Map.Entry ) iterator.next( );
			System.out.print( "Key is: " + mentry.getKey( ) + " & Value is: " + mentry.getValue( ) + "\n" );
		}
	}
}
