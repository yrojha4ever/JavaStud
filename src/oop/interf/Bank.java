package oop.interf;

public interface Bank {

	/*
	 * Compiler add abstract keyword in these methods.
	 */
	public String getBankName( );

	public int getRate( );

	/*
	 * Its OK but not good to define Constant in the interface. 
	 * Compiler change it to 	public static final int serviceChargeRate = 4.
	 */
	public int	serviceChargeRate	= 4;
}
