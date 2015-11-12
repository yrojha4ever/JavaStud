package exhand;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowCheckExceptionCompileError {
	public static void main( String[] args ) {

		ThrowCheckExceptionCompileError obj = new ThrowCheckExceptionCompileError( );
		try {
			obj.method1( );

		} catch ( FileNotFoundException e ) {
			e.printStackTrace( );

		} catch ( IOException e ) {
			e.printStackTrace( );
		}

		System.out.println( "Write your logic here..." );
	}

	public void method1( ) throws FileNotFoundException, IOException {
		method2( );
		method3( );
	}

	public void method2( ) throws IOException {
		FileInputStream ios = new FileInputStream( "C:\\t44mp.txt" );
	}

	public void method3( ) throws FileNotFoundException {
		FileInputStream ios = new FileInputStream( "C:\\te243234mp.txt" );
	}

}
