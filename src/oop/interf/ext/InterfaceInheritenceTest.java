package oop.interf.ext;

interface Printable {
	void print( );
}

interface Showable extends Printable {
	void show( );
}

interface Readable {
	int	noOfPeopRead	= 50;

	void read( );
}

public class InterfaceInheritenceTest implements Showable, Readable {

	// public int hashCode( ) {
	// return 40;
	// }

	public String toString( ) {
		return "InterfaceInheritenceTest is from tostring: " + Readable.noOfPeopRead;
	}

	public static void main( String[] args ) {

		InterfaceInheritenceTest obj = new InterfaceInheritenceTest( );
		obj.print( );
		obj.read( );
		obj.show( );
		System.out.println( obj.hashCode( ) );
		// ---------
		Showable sObj = new InterfaceInheritenceTest( );
		sObj.print( );
		// sObj.read( );
		sObj.show( );
		// ----------
		Printable pObj = new InterfaceInheritenceTest( );
		pObj.print( );
		// pObj.read( );
		// pObj.show( );
		( ( Showable ) pObj ).show( );
		// ---------------
		Readable rObj = new InterfaceInheritenceTest( );
		System.out.println( Readable.noOfPeopRead );
		// rObj.print( );
		rObj.read( );
		// rObj.show( );

		// ------------
		// Casting to another interface.
		( ( Printable ) rObj ).print( );

	}

	@Override
	public void print( ) {
		System.out.println( "PRINT" );
	}

	@Override
	public void read( ) {
		System.out.println( "READ" );
	}

	@Override
	public void show( ) {
		System.out.println( "SHOW" );
	}
}
