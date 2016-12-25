package org.javastud.studm.util;


import java.io.File;

/*import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;*/

import java.util.*;

import org.javastud.studm.service.BigDecimal;
import org.javastud.studm.service.UserService;

public class FileUtil {
	public static void main(String[] args) {

		// Date and Time: use java class Date
		Date d = new Date();
		System.out.println(d);
		
		ArrayList lst = new ArrayList();
		

		// ----------Read program---------
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Name: ");
		String s = sc.nextLine();
		System.out.println("Name: " + s);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Age: " + age);
		//--------------------------
		
		UserService us = new UserService();
		File f = new File("D:\\abc.txt");
		
		//No import 
		//1. for same package classess
		MathUtils mathUtil = new MathUtils();
		
		//2. For package: java.lang
		//Example String, Math
		System.out.println(Math.PI);
		
		BigDecimal bd = new BigDecimal();
		java.math.BigDecimal ten = new java.math.BigDecimal("10");
		

	}
}
