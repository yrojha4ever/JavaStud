package collection;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main( String args[] ) {

		// TreeSet of String Type
		TreeSet< String > tset = new TreeSet< String >( );

		// Adding elements to TreeSet<String>
		tset.add( "ABC" );
		tset.add( "String" );
		tset.add( "Test" );
		tset.add( "Pen" );
		tset.add( "Ink" );
		tset.add( "Jack" );
		System.out.println( tset );

		// TreeSet of Integer Type
		TreeSet< Integer > tset2 = new TreeSet< Integer >( );

		// Adding elements to TreeSet<Integer>
		tset2.addAll( Arrays.asList( 88, 7, 101, 0, 3, 222 ) );
		System.out.println( tset2 );
	}
}
