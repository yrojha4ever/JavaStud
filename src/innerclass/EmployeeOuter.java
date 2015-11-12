package innerclass;

public class EmployeeOuter {
	private int		id;
	private String	name;

	public EmployeeOuter( int id, String name ) {
		this.id = id;
		this.name = name;
	}

	public static void main( String[] args ) {
		 EmployeeOuter employee = new EmployeeOuter( 100, "Bill Gate" );
		
		 AddressInner address = employee.new AddressInner( "New York City", "New York", "00501", "USA" );
		 address.showProperties( );
	}

	private class AddressInner {
		private String	city;
		private String	state;
		private String	zip;
		private String	country;

		public AddressInner( String city, String state, String zip, String country ) {
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.country = country;
		}

		private void showProperties( ) {
			// Inner class can access outer class all data members including private.
			System.out.println( id );
			System.out.println( name );

			System.out.println( city );
			System.out.println( state );
			System.out.println( zip );
			System.out.println( country );
		}
	}
}
