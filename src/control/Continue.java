package control;

public class Continue {

	public static void main( String[] args ) {

		for ( int i = 0; i < 10; i++ ) {
			if ( i % 2 == 0 ) { // remainder
				continue;
			}
			System.out.println( i );
		}

	}
}
