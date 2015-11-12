package exhand;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeException {
	public static void main( String[] args ) {

		try {
			FileInputStream fi = new FileInputStream( "C:\\te234234mp.text" );
		} catch ( FileNotFoundException e ) {
			// System.err.println( e.getLocalizedMessage( ) );
			e.printStackTrace( );
		}

		System.out.println( "You can continue here." );

	}
}
