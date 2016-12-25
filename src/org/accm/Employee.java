package org.accm;

public class Employee {
	private int id;
	private String name;
	private String email;

	//Setter
	public void setId(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	//GETTER
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	
	
	@Override
	public String toString() {
		return id + " " + name + " " + email;
	}

}
