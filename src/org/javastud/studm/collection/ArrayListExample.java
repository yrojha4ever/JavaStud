package org.javastud.studm.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {

		List<String> countryList = new LinkedList<>();
		countryList.add("China");
		countryList.add("Japan");
		countryList.add("Nepal");
		countryList.add("USA");
		
		countryList.remove(1); // Japan: 1

		Iterator<String> itr = countryList.iterator();
		while (itr.hasNext()) {
			String country = itr.next();
			System.out.println(country);
			
			if (country.equals("USA")) {
				itr.remove();
			}
		}
		
		System.out.println("-----------------");
		for (String country : countryList) {
			System.out.println(country);
		}
		
		
		System.out.println(countryList.size());
		System.out.println(countryList.contains("China"));
		

	}
}
