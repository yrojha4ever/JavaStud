package innerclass;

public class AnnInnAbstClass {

	public static void main( String[] args ) {

		// Shyam is eating without annyonymous
		Person sEat = new ShyamEat( );
		sEat.eat( );

		// Ram is eating :annyonymous
		Person ramEat = new Person( ) {
			@Override
			void eat( ) {
				System.out.println( "Ram is eating..." );
			}
		};
		ramEat.eat( );

		// Hari eat: annyonymous
		Person hariEat = new Person( ) {
			@Override
			void eat( ) {
				System.out.println( "Hari is eating.." );
			}
		};
		hariEat.eat( );

	}

}
