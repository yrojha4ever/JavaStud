package oop.abst;

public class NicAsia extends Bank {

	@Override
	public String getBankName( ) {
		return "NIC Asia";
	}

	@Override
	protected int getRate( ) {
		return 10;
	}

	// You can write other variable and method here.
}
