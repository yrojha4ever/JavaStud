package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInputStreamReader {
	public static void main( String[] args ) {

		/**
		 * InputStreamReader ir = new InputStreamReader( System.in ); 
		 * BufferedReader br = new BufferedReader(ir);
		 */
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		try {
			System.out.println( "Write anything." );
			
			String name = br.readLine( );
			
			System.out.println( "You Wrote: " + name );

		} catch ( IOException e ) {
			e.printStackTrace( );
		}

	}
}
