package oop.interf;

public class Nabil implements Bank {

	@Override
	public String getBankName( ) {
		return "Nabil";
	}

	@Override
	public int getRate( ) {
		return 6;
	}

	// You can write other variable and method here.

}
