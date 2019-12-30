package com.fis.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String args[]) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(
				(obj1, obj2) -> obj1.compareTo(obj2) > 0 ? -1 :  obj1.compareTo(obj2) < 0 ? 1 : 0);
		tm.put("Vijay", 200);
		tm.put("Ankur", 1000);
		tm.put("Ajay", 500);
		tm.put("Panth", 4000);
		tm.put("Rahur", 300);

		for (Map.Entry<String, Integer> map : tm.entrySet()) {
			System.out.println(map.getKey());
		}
	}
}
