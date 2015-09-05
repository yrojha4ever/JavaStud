package oop.abst;

public class StandChart extends Bank {

	@Override
	public String getBankName( ) {
		return "Standard Chartered";
	}

	@Override
	protected int getRate( ) {
		return 4;
	}

	// You can write other variable and method here.
}
