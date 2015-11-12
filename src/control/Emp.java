package control;

public class Emp {
	int		id;
	String	name;
	Address	address;

	public Emp( int id, String name, Address address ) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString( ) {
		return id + " " + name + " " + address;
	}

	public static void main( String[] args ) {
		Address add1 = new Address( "KTM", "Bagmati", "Nepal" );
		Emp emp1 = new Emp( 111, "Sam", add1 );

		System.out.println( emp1 );

	}
}
