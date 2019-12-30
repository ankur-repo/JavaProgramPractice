package com.fis.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSortExample {

	public void sortMap(HashMap<String, Integer> map) {

		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
			public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
				return obj1.getValue().compareTo(obj2.getValue());
				
			}
		});
		
		System.out.println(list);

	}

	public static void main(String args[]) {
		MapSortExample obj = new MapSortExample();
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		hs.put("XYZ", 100);
		hs.put("ANKUR", 10);
		hs.put("VIJAY", 1000);
		hs.put("SINGH", 200);
		hs.put("VIBHU", 500);
		hs.put("ABHAY", 20);
		hs.put("ABC", 300);

		obj.sortMap(hs);

	}

}
