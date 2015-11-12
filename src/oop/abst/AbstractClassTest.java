package oop.abst;

public class AbstractClassTest {
	public static void main( String[] args ) {

		Bank nabil = new Nabil( );
		displayBankInfo( nabil );

		Bank nicAsia = new NicAsia( );
		displayBankInfo( nicAsia );

		Bank stdChrt = new StandChart( );
		displayBankInfo( stdChrt );
	}

	public static void displayBankInfo( Bank bank ) {
		System.out.println( "Bank Name: " + bank.getBankName( ) + " Rate: " + bank.getRate( ) );
		System.out.println( "Service Charge: " + bank.serviceChargeRate + " Dollar Ex Rate: " + bank.getDollarExchangeRate( ) );
	}

}
