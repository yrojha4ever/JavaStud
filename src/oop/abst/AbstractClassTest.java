package oop.abst;

public class AbstractClassTest {
	public static void main( String[] args ) {

		Bank n = new Nabil( ); // OR This is also right: Nabil n = new Nabil( );
		//printBankInfo( n.getBankName( ), n.getRate( ), n.getDollarExchangeRate( ), n.serviceChargeRate );
		printBankInfo( n );

		NicAsia na = new NicAsia( );
		//printBankInfo( na.getBankName( ), na.getRate( ), na.getDollarExchangeRate( ), na.serviceChargeRate );
		printBankInfo( na );

		StandChart sc = new StandChart( );
		//printBankInfo( sc.getBankName( ), sc.getRate( ), sc.getDollarExchangeRate( ), sc.serviceChargeRate );
		printBankInfo( sc );
	}

	public static void printBankInfo(Bank b) {
		System.out.println( "Bank Name: " + b.getBankName() + "\tInterest Rate: " + b.getRate() + "\tDollar Exchange Rate: " + b.getDollarExchangeRate( ) + "\t Service Charge Rate: " + b.serviceChargeRate );
	}

//	public static void printBankInfo( String bankName, double rate, double dollarExcRate, int serviceChargeRate ) {
//		System.out.println( "Bank Name: " + bankName + "\tInterest Rate: " + rate + "\tDollar Exchange Rate: " + dollarExcRate + "\t Service Charge Rate: " + serviceChargeRate );
//	}
}
