package org.javastud.studm.oop_slide2.abst;

public class AbstaracClassTest {
	public static void main(String[] args) {

		// IMP:Object of Abstract class can't be created.
		// Bank b = new Bank();

		Bank nbl = new Nabil();
		printBankInfo(nbl);

		Bank nic = new NicAsia();
		printBankInfo(nic);

		Bank stdChart = new StdChart();
		printBankInfo(stdChart);

	}

	public static void printBankInfo(Bank b) {
		System.out.println(
				"Bank Name: " + b.getName() +
				", Rate: " + b.getRate() +
				", Dollar Rate: " + b.getDollarExchangeRate()
				);
	}

}
