package mthread;

public class ThreadJoinPrintValues extends Thread {
	public void run( ) {
		for ( int i = 1; i <= 5; i++ ) {

			try {
				Thread.sleep( 500 );
			} catch ( Exception e ) {
				e.printStackTrace( );
			}

			System.out.println( i );
		}
	}

	public static void main( String args[] ) {
		ThreadJoinPrintValues t1 = new ThreadJoinPrintValues( );
		ThreadJoinPrintValues t2 = new ThreadJoinPrintValues( );
		ThreadJoinPrintValues t3 = new ThreadJoinPrintValues( );
		t1.start( );

		try {
			t1.join( ); // t1.join( 1500 );start t2 after 1500 sec
		} catch ( Exception e ) {
			e.printStackTrace( );
		}

		t2.start( );
		t3.start( );

		Thread t = new Thread( ) {
			public void run( ) {
				System.out.println( "Hello from thread." );
			}
		};
		t.start( );
	}
}
