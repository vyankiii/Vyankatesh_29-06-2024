package com.javaMapCollections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Example3 {

	public static void main(String[] args) {

		// LinkedHashMap
		Map<String, Long> entries = new LinkedHashMap<String, Long>();

		entries.put(new String("Rajesh"), 9090908989L);
		entries.put("Rajesh", null);
		entries.put("Harish", 8989786756L);
		entries.put("Kiran", 9090906677L);
		entries.put(null, 9090908989L);
		entries.put("Rajesh", 9090908989L);
		entries.put(null, 9090907890L);
		entries.put("Rajesh", 9090912345L);
		entries.put("Ganesh", null);
		entries.put("ABC", null);

		for (Map.Entry<String, Long> values : entries.entrySet()) {
			System.out.println(values.getKey() + " - " + values.getValue());
		}

	}

}
