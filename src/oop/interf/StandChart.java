package oop.interf;

public class StandChart implements Bank {

	@Override
	public String getBankName( ) {
		return "Standard Chartered";
	}

	@Override
	public int getRate( ) {
		return 4;
	}

	// You can write other variable and method here.
}
