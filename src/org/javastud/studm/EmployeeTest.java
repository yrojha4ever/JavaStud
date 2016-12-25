package org.javastud.studm;

import org.javastud.studm.accm.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.address);
		System.out.println(emp.email);
	}
}
