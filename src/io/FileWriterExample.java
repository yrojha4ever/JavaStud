package io;

import java.io.FileWriter;

public class FileWriterExample {
	public static void main( String args[] ) {
		try {

			FileWriter fw = new FileWriter( "D:\\fstud.txt" );

			fw.write( "Java developers of नेपाल.\nRunning Chapter: File Handling, FileWriter." );

			fw.close( );

		} catch ( Exception e ) {
			e.printStackTrace( );
		}
		System.out.println( "Information is added in the file." );
	}
}
