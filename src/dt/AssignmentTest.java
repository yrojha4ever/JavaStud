package dt;

public class AssignmentTest {
	public static void main( String[] args ) {
		int x = 10;
		if ( x > 0 && x == 10 ) {
			System.out.println( "x is greate then 0: X= " + x );
		}

		if ( x > 0 || x == 50 ) {
			System.out.println( "x is greate then 0" );
		}

		int y = 50;
		y = y + 10; // 60
		System.out.println( y );
		y += 10; // 70
		System.out.println( y );

		AssignmentTest obj = new AssignmentTest( );
		obj.show( );

	}

	public void show( ) {
		double sin30 = Math.sin( Math.PI / 6 );
		System.out.println( sin30 );
	}
}
