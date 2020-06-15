package com.collections;

import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		// Adding elements to map
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		map.put(6, "Rohit");
		map.put(1, "Ram");
		map.put(7, "Ram");
		// Traversing Map
		Set set = map.entrySet();// Converting to Set so that we can traverse
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			// Converting to Map.Entry so that we can get key and value
			// separately
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}

// HashMapDemo