package exhand;

public class RuntimeExceptionAutoPropagate {

	public static void main( String[] args ) {

		RuntimeExceptionAutoPropagate obj = new RuntimeExceptionAutoPropagate( );
		obj.method1( );

		System.out.println( "Write your logic here..." );
	}

	public void method1( ) {
		try {
			method2( );
		} catch ( ArithmeticException e ) {
			System.out.println( "****ArithmeticException handled. ****" );
			e.printStackTrace( );
		}
	}

	public void method2( ) {
		method3( );
	}

	public void method3( ) {
		int a = 75 / 0; // Runtime(Unchecked) Exception
		// It propagate error to caller method.
	}

}
