package exhand;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowCheckExceptionCompileError {
	public static void main( String[] args ) {

		ThrowCheckExceptionCompileError obj = new ThrowCheckExceptionCompileError( );
		obj.method1( );

		System.out.println( "Write your logic here..." );
	}

	public void method1( ) {
		try {
			method2( );
		} catch ( ArithmeticException e ) {
			System.out.println( "****ArithmeticException handled. ****" );
			e.printStackTrace( );
		}
	}

	public void method2( ) {
		method3( );
	}

	public void method3( ) {
		try {
			FileInputStream ios = new FileInputStream( "C:\\temp.txt" );
		} catch ( FileNotFoundException e ) {
			throw new FileNotFoundException( "File Not Found." );
		}
	}

}
