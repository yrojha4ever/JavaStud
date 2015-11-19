package collection;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main( String[] args ) {

		Set< Integer > linkedHashset = new LinkedHashSet< Integer >( );
		linkedHashset.addAll( Arrays.asList( 20, 10, 50, 75, 90 ) );
		System.out.println( linkedHashset );

		Set< String > sHashset = new LinkedHashSet< String >( );
		sHashset.addAll( Arrays.asList( "HELLO", "WORLD", "JAVA" ) );
		System.out.println( sHashset );

	}
}
