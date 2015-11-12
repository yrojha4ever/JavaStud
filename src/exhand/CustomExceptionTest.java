package exhand;

import java.util.Scanner;

public class CustomExceptionTest {
	public static void main( String[] args ) {

		Scanner sc = null;

		CustomExceptionTest obj = new CustomExceptionTest( );
		try {

			sc = new Scanner( System.in );

			System.out.println( "Enter your Age: " );
			int age = sc.nextInt( );

			obj.checkEligibleAgeForVote( age );
		} catch ( InvalidAgeException e ) {
			e.printStackTrace( );

		} finally {
			sc.close( );
		}

		// Scanner sc = null;
		// try {
		// System.out.print( "Enter your Age: " );
		// sc = new Scanner( System.in );
		//
		// CustomExceptionTest obj = new CustomExceptionTest( );
		// int age = sc.nextInt( );
		// obj.checkEligibleAgeForVote( age );
		//
		// } catch ( InvalidAgeException e ) {
		// e.printStackTrace( );
		//
		// } finally {
		// sc.close( );
		// System.out.println( "Resource Closed." );
		// }
	}

	public void checkEligibleAgeForVote( int age ) throws InvalidAgeException {

		if ( age < 18 ) {
			throw new InvalidAgeException( "You are not eligible to vote. Age: " + age );

		} else {
			System.out.println( "You can vote. Age: " + age );
		}

	}
}
