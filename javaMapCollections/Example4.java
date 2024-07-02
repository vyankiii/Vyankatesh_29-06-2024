package com.javaMapCollections;

import java.util.Map;
import java.util.TreeMap;

public class Example4 {

	public static void main(String[] args) {

		// TreeMap
		Map<String, Long> entries = new TreeMap<String, Long>();

		entries.put(new String("Rajesh"), 9090908989L);
		entries.put("Rajesh", null);
		entries.put("Harish", 8989786756L);
		entries.put("Kiran", 9090906677L);
		entries.put("xyz", 9090908989L);
		entries.put("Rajesh", 9090908989L);
		entries.put("Karthik", 9090907890L);
		entries.put("Rajesh", 9090912345L);
		entries.put("Ganesh", null);
		entries.put("ABC", null);

		for (Map.Entry<String, Long> values : entries.entrySet()) {
			System.out.println(values.getKey() + " - " + values.getValue());
		}

	}

}
