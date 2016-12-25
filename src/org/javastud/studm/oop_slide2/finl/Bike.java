package org.javastud.studm.oop_slide2.finl;

public class Bike {
	
	//1.final variable with value
	final int speedLimit = 90; //km/hr
	
	//2. finla variable without value
	final int cc;
	public Bike(int cc){
		this.cc = cc;
	}
	
	//3. final used with statick variable
	static final double PI = 3.14;
	static final double G;
	static {
		G = 9.8;
	}
	
	void run(){
		//speedLimit =  150;
		System.out.println("Speed Limit: " + speedLimit);
	}
	
	public static void main(String[] args) {
		Bike honda = new Bike(150);
		//ERROR: honda.cc = 125;
		
		Bike twister = new Bike(200);
	}
	
}
