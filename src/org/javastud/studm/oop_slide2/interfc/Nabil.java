package org.javastud.studm.oop_slide2.interfc;

import java.io.Serializable;

public class Nabil implements Bank, NTC, Serializable{

	@Override
	public String getName() {
		return "Nabil";
	}
	
	@Override
	public double getRate() {
		return 5.5;
	}

	@Override
	public String recharge(double amount, String phNo) {
		return "Successfully Recharged Rs."+ amount + " in " + phNo;
	}

}
