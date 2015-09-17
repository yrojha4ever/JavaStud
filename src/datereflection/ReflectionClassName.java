package datereflection;

public class ReflectionClassName {
	public static void main( String[] args ) throws ClassNotFoundException {

		Class c = Class.forName( "java.util.Date" );
		System.out.println( c.getName( ) );

		Integer intObj = new Integer( "25" );
		Class cInt = intObj.getClass( );
		System.out.println( cInt.getName( ) );

		Class c3 = String.class;
		System.out.println( c3.getName( ) );

	}
}
