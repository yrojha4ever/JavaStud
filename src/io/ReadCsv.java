package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsv {
	public static void main( String[] args ) {
		BufferedReader br = null;
		try {
			br = new BufferedReader( new FileReader( new File( "D:\\student.csv" ) ) );
			String row;
			System.out.println( "ID:\tName\tADdress" );
			while ( ( row = br.readLine( ) ) != null ) {
				String[] cols = row.split( "," );
				System.out.println( cols[ 0 ] + "\t" + cols[ 1 ] + "\t" + cols[ 2 ] );
			}
		} catch ( FileNotFoundException e ) {
			e.printStackTrace( );

		} catch ( IOException e ) {
			e.printStackTrace( );

		} finally {
			if ( br != null ) {
				try {
					br.close( );
				} catch ( IOException e ) {
					e.printStackTrace( );
				}
			}
		}

	}

}
