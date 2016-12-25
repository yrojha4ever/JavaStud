package org.javastud.studm.slide3.innerclass;

public class MemberClassO {

	private int id = 5;
	private String name = "RAM";
	
	public void showName(){
		System.out.println("Name: " + name);
	}

	public class MemberClassI {
		private String address = "Kathmandu";

		public void display() {
			System.out.println(id + " " + name + " " + address);
		}
	}

}
