package oop.interf;

public class InterfaceImplTest {
	public static void main( String[] args ) {

		Bank n = new Nabil( ); // OR This is also right: Nabil n = new Nabil( );
		printBankInfo( n );

		NicAsia na = new NicAsia( );
		printBankInfo( na );

		Bank sc = new StandChart( );
		printBankInfo( sc );

	}

	public static void printBankInfo( Bank b ) {
		System.out.println( "Bank Name: " + b.getBankName( ) + "\tInterest Rate: " + b.getRate( ) + "\t Service Charge Rate: " + Bank.serviceChargeRate );
	}

	/*
	 * public static void printBankInfo( String bankName, double rate, int serviceChargeRate ) { 
	 * System.out.println( "Bank Name: " + bankName +
	 * "\tInterest Rate: " + rate + "\t Service Charge Rate: " + serviceChargeRate ); 
	 * }
	 */
}
