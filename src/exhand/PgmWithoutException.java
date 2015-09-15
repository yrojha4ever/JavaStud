package exhand;

public class PgmWithoutException {

	public static void main( String[] args ) {
		int no1 = 100;
		int no2 = 0;

		try {
			int value = no1 / no2;
			System.out.println( value );
		} catch ( ArithmeticException e ) {
			e.printStackTrace( );
		}

		double deposit = no1 + 1000.0;
		System.out.println( "Deposit Amont: " + deposit );
	}
}
