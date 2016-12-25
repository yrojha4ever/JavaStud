package org.javastud.studm.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Integer, String> hmap = new TreeMap<>();
		hmap.put(1, "Core Java");
		hmap.put(2, "Adv Java");
		hmap.put(5, "Hibernate");
		hmap.put(10, "Spring");
		hmap.put(8, "Maven");
		
		//Get value based on key:
		String val = hmap.get(2); //"Adv Java"
		System.out.println("Key 2: "+ val);
		
		//Remove:
		hmap.remove(5); //"Hibernate"
		
		System.out.println("------------");
		for(Entry<Integer, String> hm: hmap.entrySet()){
			System.out.println(hm.getKey() + "  :  " + hm.getValue());
		}
		
		
		
		
		
		
		
		
		

	}
}
