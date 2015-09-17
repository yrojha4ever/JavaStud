package datereflection;

public class InstanceOfUses {
	public static void main( String[] args ) {

		displayObjectType( new Integer( "25" ) );

		displayObjectType( "25" );
	}

	public static void displayObjectType( Object o ) {

		if ( o instanceof Integer ) {
			System.out.println( "Parameter is Integer: " + o );

		} else if ( o instanceof String ) {
			System.out.println( "Parameter is String: " + o );
		}
	}
}
