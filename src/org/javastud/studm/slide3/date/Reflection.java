package org.javastud.studm.slide3.date;

import java.lang.reflect.Method;

public class Reflection {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("java.util.Date");
			System.out.println(c.getName());
			System.out.println("IsEnum: " + c.isEnum());
			
			System.out.println(c.getSuperclass());
			
			Class s = String.class;
			for(Method method: s.getDeclaredMethods()){
				System.out.println(method.getName());
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
