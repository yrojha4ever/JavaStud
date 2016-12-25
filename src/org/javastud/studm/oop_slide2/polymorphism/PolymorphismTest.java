package org.javastud.studm.oop_slide2.polymorphism;

public class PolymorphismTest {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		System.out.println(bank.getRate());
		
		//Compile Time Polymorphism
		NicAsia nic = new NicAsia();
		System.out.println(nic.getRate());
		
		//Runtime polymorphism
		Bank nicAsia = new NicAsia();
		System.out.println(nicAsia.getRate());
		
		//Parent can hold object of child class.
		Bank nabil = new Nabil();
		System.out.println(nabil.getRate());
		System.out.println(nabil.name);
		
		//Casting needed while conversion of object from Parent -> Child
		Nabil n = (Nabil)nabil;
		System.out.println("Rate: " + n.getRate());
		
		
		
	}
}
