package org.javastud.studm.oop_slide2.override_super;

public class Bike extends Vehicle {
	
	int speed = 100;
	
	/*public Bike(){
		super();
	}*/
	
	public Bike(String s){
		super(s);
		System.out.println("--Bike--");
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("Bike is running.");
	}
	
	public void showSpeed(){
		System.out.println("Bike Speed: " + this.speed); 
		System.out.println("Vehicle Speed: " + super.speed); 
		
		{
			String msg = "I am inside block.";
			System.out.println(msg);
		}
		
		{
			String msg = "I am second block.";
			System.out.println(msg);
		}
		
	}
	
	public static void main(String[] args) {
		Bike honda = new Bike("THIS IS NEPAL");
		honda.run();
		honda.showSpeed();
	}
}
