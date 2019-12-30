package com.fis.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSorting {
	
	String str = "apple banna apple fruit fruit apple hello hi hi hello hi";
	public static void main(String args[]) {
		HashMapSorting obj = new HashMapSorting();
		Map<String, Integer> hm = new LinkedHashMap<String, Integer>();
		String strArray[] = obj.str.split(" ");
		for(String word : strArray) {
			if(hm.containsKey(word)) {
				hm.put(word, hm.get(word)+1);
			}else {
				hm.put(word, 1);
			}
		}
		
		hm = sortHashMap(hm);
		for(Map.Entry<String, Integer> entry: hm.entrySet()) {
			System.out.println("key:::"+entry.getKey()+"  Value is::"+entry.getValue());
		}
		
		
	}
	public static Map<String, Integer> sortHashMap(Map<String, Integer> hm) {
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(hm.entrySet());
		
		/*Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				if(obj1.getValue() < obj2.getValue()) {
					return -1;
				}else if(obj1.getValue() > obj2.getValue()) {
					return 1;
				}else {
					return 0;
				}
			}
			
			
		});*/
		
		Collections.sort(list, (obj1,obj2)-> obj1.getValue()>obj2.getValue()?1:obj1.getValue()<obj2.getValue()?-1:0);
		
		Map<String, Integer> tempMap = new LinkedHashMap<String, Integer>();
		for(Map.Entry<String, Integer> entry: list) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}

}
