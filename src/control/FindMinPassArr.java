package control;

public class FindMinPassArr {

	public static void main( String[] args ) {

		int a[] = { 30, 10, 3, 7, 2 };
		min( a );

		int b[] = { 50, 10, 15 };
		min( b );
	}

	static void min( int arr[] ) {

		int min = arr[ 0 ]; // save min value in min variable.

		for ( int i = 0; i < arr.length; i++ ) {

			if ( arr[ i ] < min ) {// arr element is less then min value
				min = arr[ i ];// replace min value with arr element
			}

		}
		System.out.println( "Min Value: " + min );
	}

}
