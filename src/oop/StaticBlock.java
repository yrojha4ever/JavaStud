package oop;

public class StaticBlock {
	private static String	college;

	static {
		college = "ASCOL";
		System.out.println( "static block is invoked" );
	}

	public static void main( String args[] ) {
		System.out.println( "Hello from main" );

		System.out.println( college ); // ASCOL

		college = "BRITISH";

		System.out.println( college );
	}

}
