package org.javastud.studm.accm;

public class Employee {
	public int id = 10;
	private String name = "RAM";
	String address = "KTM"; //package-private (package-local)
	protected String email = "ram@gmail.com";

	//Protected = (package-private) + 
	//child class can access it
		
	public void show() {
		System.out.println(id + "\t" + name + "\t" + address + "\t" + email);
	}

}
