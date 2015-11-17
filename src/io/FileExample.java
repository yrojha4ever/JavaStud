package io;

import java.io.File;

public class FileExample {

	public static void main( String[] args ) {

		/* Instantiate File */
		File file = new File( "D:\\ab.txt" );

		// Check if above path is Directory?
		boolean isDirectory = file.isDirectory( );
		System.out.println( "ab.txt is directory: " + isDirectory );

		/* File exist of not */
		boolean isFileExits = file.exists( );
		System.out.println( "File is exist: " + isFileExits );

		/* Create Directory */
		File fDir = new File( "D:\\JavaStud" );
		boolean dirCreated = fDir.mkdir( );
		if ( dirCreated ) {
			System.out.println( "JavaStud is successfully created." );
		}

		/* List name of all files */
		String[] fileNames = fDir.list( );
		for ( String fileName: fileNames ) {
			System.out.println( fileName );
		}

		/* List of Files */
		File[] files = fDir.listFiles( );
		for ( File file2: files ) {
			System.out.println( file2.getAbsolutePath( ) + " " + file2.isDirectory( ) );
		}
	}
}
