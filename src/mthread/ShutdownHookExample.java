package mthread;

public class ShutdownHookExample {
	public static void main( String[] args ) {

		Thread t1 = new Thread( ) {
			@Override
			public void run( ) {
				System.out.println( "Shut down hook run this method. " );
			}
		};

		Runtime r = Runtime.getRuntime( );
		r.addShutdownHook( t1 );

		try {
			System.out.println( "Press ctrl+c in command window to exit program." );
			Thread.sleep( 3000 );
		} catch ( InterruptedException e ) {
			e.printStackTrace( );
		}

		System.out.println( "Calling System.exit()..." );
		System.exit( 0 ); // exit program in the middle

		System.out.println( "After 3 second.." );

	}
}
