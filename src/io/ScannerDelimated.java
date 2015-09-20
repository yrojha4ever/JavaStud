package io;

import java.util.Scanner;

public class ScannerDelimated {
	public static void main( String[] args ) {
		String input = "5 teacher and 200 students are in Velley school.";
		Scanner s = new Scanner( input ).useDelimiter( "\\s" );
		System.out.println( s.nextInt( ) ); // 5
		System.out.println( s.next( ) ); // teacher
		s.next( );// and
		System.out.println( s.nextInt( ) );// 200
		System.out.println( s.next( ) ); // students
		s.close( );
	}
}
