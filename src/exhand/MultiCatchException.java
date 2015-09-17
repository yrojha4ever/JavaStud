package exhand;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultiCatchException {
	public static void main( String[] args ) {
		try {

			int val = 45 / 0; // ERROR: So below lines in try block will be not executed.
			FileInputStream fi = new FileInputStream( "C:\\temp.text" );

		} catch ( ArithmeticException e ) {
			System.out.println( "ArithmeticException" );
			e.printStackTrace( );

		} catch ( FileNotFoundException e ) {
			System.out.println( "FileNotFoundException" );
			e.printStackTrace( );

		} catch ( Exception e ) {
			System.out.println( "Exception is called." );
			e.printStackTrace( );

		}

		System.out.println( "Continue program here!" );
	}
}
