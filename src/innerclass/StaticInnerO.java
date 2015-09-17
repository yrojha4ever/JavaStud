package innerclass;

public class StaticInnerO {
	static int	count	= 100;

	public static void main( String[] args ) {
		StaticInnerO.StaticInnerI inn = new StaticInnerO.StaticInnerI( );
		inn.increaseAndDisplay( );
		inn.increaseAndDisplay( );
	}

	private static class StaticInnerI {
		public void increaseAndDisplay( ) {
			System.out.println( ++count );
		}
	}
}
