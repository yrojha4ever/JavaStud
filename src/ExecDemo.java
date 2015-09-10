public class ExecDemo {

	public static void main( String[] args ) {

		try {

			Runtime r = Runtime.getRuntime( );
			r.exec( "calc" );

		} catch ( Exception e ) {
			System.out.println( "Error executing notepad." );
		}
	}

}
