package oop.interf;

public class InterfaceImplTest {
	public static void main( String[] args ) {

		Bank n = new Nabil( ); // OR This is also right: Nabil n = new Nabil( );
		printBankInfo( n.getBankName( ), n.getRate( ), n.serviceChargeRate );

		NicAsia na = new NicAsia( );
		printBankInfo( na.getBankName( ), na.getRate( ), Bank.serviceChargeRate );

		Bank sc = new StandChart( );
		printBankInfo( sc.getBankName( ), sc.getRate( ), sc.serviceChargeRate );

	}

	public static void printBankInfo( String bankName, double rate, int serviceChargeRate ) {
		System.out.println( "Bank Name: " + bankName + "\tInterest Rate: " + rate + "\t Service Charge Rate: " + serviceChargeRate );
	}
}
