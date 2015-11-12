package control;


public class WhileDemo {
	private static int	num	= 5;

	public static void main( String[] args ) throws InterruptedException {

		int n = num;
		while ( n > 0 ) {
			System.out.println( "tick " + n );
			n--;
		}

		for ( n = num; n > 0; n-- ) {
			System.out.println( "Tick: " + n );
		}

		int i = 0;
		for ( ;; ) {
			System.out.println( i++ );
			Thread.sleep( 1000 );
			if ( i > 10 ) {
				break;
			}
		}

		int nums[] = { 1, 2, 3, 4, 5 };
		for ( int j: nums ) {
			System.out.print( j + "\t" );
		}

	}

}
