package exhand;

public class MultiTryCatch {

	public static void main( String[] args ) {

		try {

			MultiTryCatch obj = new MultiTryCatch( );
			int divideResult = 0;

			try {
				divideResult = obj.divide( 10, 0 ); //Error:divide by 0
			} catch ( ArithmeticException e ) {
				System.out.println( "ERROR: 10/0" );
				e.printStackTrace( );
			}

			try {
				int[] arr = new int[ 5 ];
				arr[ 10 ] = 50; //Error: index is 10, array size is only 5
			} catch ( ArrayIndexOutOfBoundsException e ) {
				System.out.println( "ERROR: Array Size: 5, item insert index:10" );
				e.printStackTrace( );
			}

			System.out.println( divideResult );

			String str = null;
			System.out.println( str.length( ) ); //Error: method call in null value

		} catch ( Exception e ) {
			System.out.println( "Exception Root." );
			e.printStackTrace( );
		}

	}

	public int divide( int a, int b ) {
		return a / b;
	}

}
