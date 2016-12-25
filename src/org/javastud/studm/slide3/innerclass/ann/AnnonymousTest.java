package org.javastud.studm.slide3.innerclass.ann;

public class AnnonymousTest {
	public static void main(String[] args) {
		
		Bank nabil = new Nabil();
		System.out.println("Bank Name: " + nabil.getName());
		
		//Annonymous Class
		Bank standChart = new Bank(){

			@Override
			public String getName() {
				return "Standard Chartered.";
			}
			
		};
		System.out.println("Bank Name: " + standChart.getName());
		
		
		Bank nicAsia = new Bank(){
			@Override
			public String getName() {
				return "Nic Asia Bank";
			}
		};
		System.out.println("Bank Name: "+ nicAsia.getName());
		
		
		
		
		
	}
}
