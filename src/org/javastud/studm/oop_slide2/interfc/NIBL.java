package org.javastud.studm.oop_slide2.interfc;

public class NIBL implements Bank, NTC {

	@Override
	public String getName() {
		return "NIBL";
	}

	@Override
	public double getRate() {
		return 6.5;
	}

	@Override
	public String recharge(double amount, String phNo) {
		return "Successfully Recharged Rs."+ amount + " in " + phNo;
	}

}
