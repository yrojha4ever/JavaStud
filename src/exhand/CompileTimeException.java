package exhand;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeException {
	public static void main( String[] args ) {
		try {
			FileInputStream fi = new FileInputStream( "C:\\temp.text" );
		} catch ( FileNotFoundException e ) {
			e.printStackTrace( );
		}

		System.out.println( "Continue other operation here." );
	}
}
