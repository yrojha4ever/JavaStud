package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main( String[] args ) {

		/* This is how to declare HashMap */
		HashMap< Integer, String > hmap = new HashMap< Integer, String >( );

		/* Adding elements to HashMap */
		hmap.put( 12, "Core Java" );
		hmap.put( 2, "Adv Java" );
		hmap.put( 7, "Spring" );
		hmap.put( 49, "Hibernate" );
		hmap.put( 3, "Maven" );

		/* Get values based on key */
		String var = hmap.get( 2 ); // Key:2
		System.out.println( "Value for key:2 is: " + var + "\n" );

		/* Remove values based on Key:3 */
		hmap.remove( 3 );

		/* Display content using Iterator */
		Set< Entry< Integer, String > > set = hmap.entrySet( );
		Iterator< Entry< Integer, String > > iterator = set.iterator( );
		while ( iterator.hasNext( ) ) {
			Map.Entry< Integer, String > me = iterator.next( );
			System.out.print( "Key is: " + me.getKey( ) + " & Value is: " + me.getValue( ) + "\n" );
		}
		
		/*Easy way*/
		System.out.println("------------");
		for(Entry<Integer, String> hm: hmap.entrySet()){
			System.out.println(hm.getKey() + "  :  " + hm.getValue());
		}
		
		//to string works even easier
		System.out.println(hmap);

	}
}
