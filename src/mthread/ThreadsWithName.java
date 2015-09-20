package mthread;

public class ThreadsWithName extends Thread {

	@Override
	public void run( ) {
		System.out.println( "run(): Thread Name: " + Thread.currentThread( ).getName( ) );
		System.out.println( Thread.currentThread( ).getPriority( ) );
	}

	public static void main( String[] args ) {
		ThreadsWithName t = new ThreadsWithName( );
		t.setPriority( Thread.MAX_PRIORITY );
		t.setName( "Thread1Stud" );
		t.start( );
		System.out.println( "main(): Thread Name: " + t.getName( ) );
	}

}
