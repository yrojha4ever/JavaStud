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

		/* Create Directory */
		File fDir = new File( "D:\\temp" );
		boolean dirCreated = fDir.mkdir( );

		/* List name of all files */
		String[] fileNames = file.list( );

		/* List of Files */
		File[] files = file.listFiles( );

	}
}
