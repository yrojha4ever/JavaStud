package oop.interf;

public class PrintableImpl implements Printable {

	@Override
	public void print( ) {
		System.out.println( "PrintableImpl is printing..." );
	}

	public static void main( String[] args ) {
		Printable obj = new PrintableImpl( );
		obj.print( );
	}

}
