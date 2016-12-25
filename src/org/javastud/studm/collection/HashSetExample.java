package org.javastud.studm.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
	public static void main(String[] args) {

		Set<String> countrySet = new TreeSet<>();
		countrySet.add("Nepal");
		countrySet.add("China");
		countrySet.add("USA");
		countrySet.add("Nepal"); // X deleted
		countrySet.add("Japan");

		for (String country : countrySet) {
			System.out.println(country);
		}

		countrySet.remove("Japan");

		Iterator<String> itr = countrySet.iterator();
		while (itr.hasNext()) {
			String country = itr.next();
			if (country.equals("USA")) {
				itr.remove();
			}
		}

		System.out.println("*******************");
		for (String country : countrySet) {
			System.out.println(country);
		}
		
		//==========================
		System.out.println("*******************");
		
		Set<Integer> nos = new TreeSet<>();
		nos.add(10);
		nos.add(50);
		nos.add(25);
		for (Integer no : nos) {
			System.out.println(no);
		}
		
	}
}
