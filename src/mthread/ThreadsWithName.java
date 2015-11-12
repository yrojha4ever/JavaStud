package mthread;

public class ThreadsWithName extends Thread {

	@Override
	public void run( ) {
		System.out.println( "run(): Thread Name: " + Thread.currentThread( ).getName( ) );
		try {
			Thread.sleep( 2000 );
		} catch ( InterruptedException e ) {
			e.printStackTrace( );
		}
		System.out.println( "Priority: " + Thread.currentThread( ).getPriority( ) + 
				" IsDemon:" + Thread.currentThread( ).isDaemon( ) );
	}

	public static void main( String[] args ) {
		ThreadsWithName t = new ThreadsWithName( );
		t.setPriority( Thread.MAX_PRIORITY );
		t.setName( "Thread1" );

		ThreadsWithName t2 = new ThreadsWithName( );
		t2.setName( "Thread2" );
		t2.setPriority( 4 );
		t2.setDaemon( true );

		t.start( );
		t2.start( );

		System.out.println( "main(): Thread Name: " + Thread.currentThread( ).getName( ) );
	}

}
