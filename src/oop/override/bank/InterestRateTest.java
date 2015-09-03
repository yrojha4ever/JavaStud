package oop.override.bank;

public class InterestRateTest {
	public static void main(String[] args) {
		StandChart standChart = new StandChart();
		System.out.println("StandChart Rate: "+ standChart.getRate());
		
		Nabil nabil = new Nabil();
		System.out.println("Nabil Rate: "+ nabil.getRate());
		
		NicAsia nicAsia = new NicAsia();
		System.out.println("NicAsia Rate: "+ nicAsia.getRate());
	}
}
