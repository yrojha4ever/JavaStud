public class TypeCast {
	public static void main( String[] args ) {
		double x = 9.997;
		int nx = ( int ) x; // 9

		System.out.println( nx );

		byte b = 50;
		b = ( byte ) ( b * 2 );

		int i = 5000;
		float f = 5.67f;

		float result = i * f;

		System.out.println( result );

	}
}
