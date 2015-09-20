package io;

import java.util.Scanner;

public class ScannerConsoleInput {
	public static void main( String[] args ) {

		Scanner sc = new Scanner( System.in );
		System.out.println( "Student Detail." );

		System.out.print( "Name: " );
		String name = sc.next( );

		System.out.print( "\nRollNo: " );
		int rollNo = sc.nextInt( );

		System.out.print( "\nAddress: " );
		String address = sc.next( );

		System.out.println( "\nYour Name: " + name + " RollNo: " + rollNo + " Address: " + address );
		sc.close( );
	}
}
