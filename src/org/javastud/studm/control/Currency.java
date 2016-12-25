package org.javastud.studm.control;

public enum Currency {
	PENNY(1, "Penny"), NICKLE(5, "Nickle"), DIME(10, " This is Dime"), QUARTER(25, "quarter");

	int value;
	String desc;

	Currency(int value, String desc) {
		this.value = value;
		this.desc = desc;
	}

}
