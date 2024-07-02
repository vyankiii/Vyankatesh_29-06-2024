package com.javaMapCollections;

import java.util.Hashtable;
import java.util.Map;

public class Example5 {

	public static void main(String[] args) {

		// TreeMap
		Hashtable<String, Long> entries = new Hashtable<String, Long>();

		entries.put(new String("Rajesh"), 9090908989L);
		entries.put("Rajesh", 6767898900l);
		entries.put("Harish", 8989786756L);
		entries.put("Kiran", 9090906677L);
		entries.put("xyz", 9090908989L);
		entries.put("Rajesh", 9090908989L);
		entries.put("Karthik", 9090907890L);
		entries.put("Rajesh", 9090912345L);
		entries.put("Ganesh", 7788778899l);
		entries.put("ABC", 8989787866L);

		for (Map.Entry<String, Long> values : entries.entrySet()) {
			System.out.println(values.getKey() + " - " + values.getValue());
		}

	}

}
