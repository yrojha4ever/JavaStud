package mthread;

public class RunnableInterface implements Runnable {

	@Override
	public void run( ) {
		System.out.println( "Thread: Runnable> run()" );
	}

	public static void main( String[] args ) {
		RunnableInterface runnable = new RunnableInterface( );
		Thread t = new Thread( runnable );
		t.start( );
		System.out.println( "Thread: RunnableInterface> Main()" );
	}

}
