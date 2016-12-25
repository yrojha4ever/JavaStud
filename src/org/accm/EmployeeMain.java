package org.accm;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		//emp.id = 10;
		emp.setId(10);
		
		//emp.name = "SHYAM";
		emp.setName("SHYAM");
		
		//emp.email = "shyam@gmail.com";
		emp.setEmail("shyam@gmail.com");
		
		//GETTER
		System.out.println("ID: "+ emp.getId());
		System.out.println("Name: "+ emp.getName());
		System.out.println("Email: " + emp.getEmail());
		
		
		System.out.println(emp);
	}
}
