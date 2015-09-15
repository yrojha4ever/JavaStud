package exhand;

import java.util.Scanner;

public class FinallyTest {

	public static void main( String[] args ) {
		FinallyTest obj = new FinallyTest( );
		obj.finallyCallTest( );
	}

	public void finallyCallTest( ) {

		Scanner sc = null;
		try {
			sc = new Scanner( System.in );

			System.out.println( "Input a int value." );
			int val = sc.nextInt( ); // Error if you input String value.
			System.out.println( val );

		} catch ( ClassCastException e ) {
			e.printStackTrace( );

		} finally { // Always executed.
			sc.close( );
			System.out.println( "Scanner resource Closed." );
		}

	}
}
