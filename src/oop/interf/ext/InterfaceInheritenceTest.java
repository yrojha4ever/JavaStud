package oop.interf.ext;

public class InterfaceInheritenceTest implements Showable, Readable {

	public static void main( String[] args ) {

		InterfaceInheritenceTest obj = new InterfaceInheritenceTest( );
		obj.print( );
		obj.read( );
		obj.show( );
		System.out.println( obj.hashCode( ) );
		// ---------
		Showable sObj = new InterfaceInheritenceTest( );
		sObj.print( );
		// sObj.read( ); //ERROR
		sObj.show( );
		( ( Readable ) sObj ).read( ); // OK
		// ----------
		Printable pObj = new InterfaceInheritenceTest( );
		pObj.print( );
		// pObj.read( );
		// pObj.show( );
		( ( Readable ) pObj ).read( );
		( ( Showable ) pObj ).show( );
		// ---------------
		Readable rObj = new InterfaceInheritenceTest( );
		System.out.println( Readable.noOfPeopRead );
		// rObj.print( );
		rObj.read( );
		// rObj.show( );

		// Casting to another interface.
		( ( Printable ) rObj ).print( );
		( ( Showable ) rObj ).show( );

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
