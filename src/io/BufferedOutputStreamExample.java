package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BufferedOutputStreamExample {
	public static void main( String[] args ) {
		try {
			FileOutputStream fout = new FileOutputStream( "D:\\bstud.txt" );
			BufferedOutputStream bout = new BufferedOutputStream( fout );

			System.out.println( "Type Text:" );
			Scanner sc = new Scanner( System.in );
			String str = sc.nextLine( );

			// String str = "Java developers of Nepal.\nRunning Chapter: File Handling, BufferedOutputStream";
			byte[] b = str.getBytes( );

			bout.write( b );
			bout.flush( );

			bout.close( );
			fout.close( );

			System.out.println( "Information is added in the file." );

		} catch ( Exception e ) {
			e.printStackTrace( );
		}
	}
}
