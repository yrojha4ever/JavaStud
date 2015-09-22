package innerclass;

public class AnnonymousInterfaceImpl {
	public static void main( String[] args ) {

		Eatable e = new Eatable( ) {
			@Override
			public void eat( ) {
				System.out.println( "I am eating.." );
			}
		};

		e.eat( );
	}
}

interface Eatable {
	void eat( );
}
