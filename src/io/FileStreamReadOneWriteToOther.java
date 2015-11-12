package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Copy content of one file to another.
 * @author ojhay
 */
public class FileStreamReadOneWriteToOther {
	public static void main( String[] args ) {

		try {
			FileInputStream fin = new FileInputStream( "D:\\stud.txt" );
			FileOutputStream fout = new FileOutputStream( "D:\\stud2.txt" );
			int i = 0;
			while ( ( i = fin.read( ) ) != -1 ) {
				System.out.print( ( char ) i );
				fout.write( ( char ) i );
			}
			fin.close( );
			fout.close( );

		} catch ( Exception e ) {
			e.printStackTrace( );
		}
	}
}
