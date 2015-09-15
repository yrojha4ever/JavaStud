package exhand;

public class ThrowExampleWithTryCatch {
	public static void main( String[] args ) {

		try {
			validateAge( 17 ); // Exception came here.

		} catch ( ArithmeticException e ) {
			e.printStackTrace( );
		}

		System.out.println( "Your Other logic..." );
	}

	public static void validateAge( int age ) {
		if ( age < 18 ) {
			throw new ArithmeticException( "Age: " + age + " is not valid." );
		} else {
			System.out.println( "You are eligible to vote." );
		}
	}
}
