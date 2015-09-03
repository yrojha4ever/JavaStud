package oop.override.bank;

public class NicAsia extends Bank {

	@Override
	protected int getRate() {
		return 10;
	}
}
