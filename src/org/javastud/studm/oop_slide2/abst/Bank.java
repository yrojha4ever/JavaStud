package org.javastud.studm.oop_slide2.abst;

public abstract class Bank {
	
	public abstract String getName();

	public abstract double getRate();
	
	protected final double getDollarExchangeRate(){
		return 105.5;
	}
	
}
