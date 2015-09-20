package control;

import java.util.Arrays;

public class FindMinPassArr {

	public static void main( String[] args ) {
		int a[] = { 30, 10, 3, 7, 2 };
		Arrays.sort( a );
		for ( int i = 0; i < a.length; i++ ) {
			System.out.println( a[ i ] );
		}
	}

	static void min( int arr[] ) {
		int min = arr[ 0 ];
		for ( int i = 0; i < arr.length; i++ ) {

			if ( min > arr[ i ] ) {
				min = arr[ i ];
			}

		}
		System.out.println( min );
	}

}
