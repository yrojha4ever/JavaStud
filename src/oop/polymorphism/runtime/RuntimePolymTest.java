package oop.polymorphism.runtime;

public class RuntimePolymTest {
	public static void main(String[] args) {
		Bank standChart = new StandChart();
		System.out.println("StandChart Rate: " + standChart.getRate());

		Bank nabil = new Nabil();
		System.out.println("Nabil Rate: " + nabil.getRate());

		Bank nicAsia = new NicAsia();
		System.out.println("NicAsia Rate: " + nicAsia.getRate());
	}
}
