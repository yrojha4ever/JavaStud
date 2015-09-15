package exhand;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsUncheckPropagation {

	public static void main( String[] args ) {

		ThrowsUncheckPropagation obj = new ThrowsUncheckPropagation( );
		obj.method1( );

		System.out.println( "Write your logic here..." );
	}

	public void method1( ) {

		try {
			method2( );

		} catch ( FileNotFoundException e ) {
			System.out.println( "****FileNotFoundException is handled. ****" );
			e.printStackTrace( );
		}
	}

	public void method2( ) throws FileNotFoundException {
		method3( );
	}

	public void method3( ) throws FileNotFoundException {
		FileInputStream ios = new FileInputStream( "C:\\temp.txt" );
	}

}
