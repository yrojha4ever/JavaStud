public class StringTest {
	public static void main( String[] args ) {

		// TEST 1
		char[] ca = { 'j', 'a', 'v', 'a' };
		String caStr = new String( ca );
		System.out.println( caStr );

		// TEST 2
		String s = "JAVA";
		System.out.println( s );

		// Test 3:
		System.out.println( "JAVA3" );

		// TEST 4:
		String h1 = "HELLO";
		int l = h1.length( );
		System.out.println( l );

		System.out.println( "HELLO".length( ) );

		// TEST 4:
		System.out.println( "HELLO".toLowerCase( ) );

		System.out.println( "HELLO".indexOf('L', 3 ) );

	}
}