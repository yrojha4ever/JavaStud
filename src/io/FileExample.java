package io;

import java.io.File;

public class FileExample {

	@SuppressWarnings( "unused" )
	public static void main( String[] args ) {

		/* Instantiate File */
		File file = new File( "D:\\ab.txt" );

		// Check if above path is Directory?
		boolean isDirectory = file.isDirectory( );

		/* File exist of not */
		boolean isFileExits = file.exists( );
		System.out.println( "File is exist: " + isFileExits );

		/* Create Directory */
		File fDir = new File( "D:\\temp" );
		boolean dirCreated = fDir.mkdir( );

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
