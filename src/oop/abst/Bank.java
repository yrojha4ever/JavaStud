package oop.abst;

public abstract class Bank {

	public abstract String getBankName( );

	protected abstract int getRate( );

	public int	serviceChargeRate	= 4;

	protected double getDollarExchangeRate( ) {
		// Write your logic to fetch dollar exchange rate.
		// For example we use constantc
		return 101.5;
	}

}
