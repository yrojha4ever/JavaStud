package oop.interf;

public class NicAsia implements Bank {

	@Override
	public String getBankName( ) {
		return "NIC Asia";
	}

	@Override
	public int getRate( ) {
		return 10;
	}

	// You can write other variable and method here.
}
