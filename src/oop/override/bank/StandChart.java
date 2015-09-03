package oop.override.bank;

public class StandChart extends Bank {

	@Override
	protected int getRate() {
		return 4;
	}
}
