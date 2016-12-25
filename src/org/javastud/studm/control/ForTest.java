package org.javastud.studm.control;

public class ForTest {
	public static void main(String[] args) throws InterruptedException {

		// index
		for (int i = 0; i < args.length; i++) {

		}

		// for each
		for (String string : args) {

		}

		for (int i = 0;  ; i++) {
			System.out.println("*");
			Thread.sleep(500);
			
			if(i == 2){
				continue;
			}

			if (i == 20) {
				break;
			}
		}

	}
	
	public double area(double r){
		return (Math.PI * r * r);
	}
	
	
	
	
	
	
	
}
