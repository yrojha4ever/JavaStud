package oop.abst;

public class Nabil extends Bank {

	@Override
	public String getBankName( ) {
		return "Nabil";
	}

	@Override
	protected int getRate( ) {
		return 6;
	}

	// You can write other variable and method here.

}
