package org.javastud.studm.oop_slide2.interfc;

public interface Bank {
	String getName();
	double getRate();
	
	//variable inside interface are constant
	int serviceChargeRate = 5; //public static final : constant
}
