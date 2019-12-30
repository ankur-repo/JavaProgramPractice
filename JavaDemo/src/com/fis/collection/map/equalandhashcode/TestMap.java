package com.fis.collection.map.equalandhashcode;

import java.util.HashMap;

public class TestMap {
	
	public static void main(String args[]) {
		HashMap<Person, String > map = new HashMap<Person, String>();
		Person p1 = new Person("101","Amit",1000);
		Person p2 = new Person("102","Ankur",10000);
		Person p3 = new Person("101","Amit",1000);
		Person p4 = new Person("101","Amit",1000);
		System.out.println(p1.equals(p3)+" p1 hashcode::: "+p1.hashCode()+":::p3 hashcode "+p3.hashCode());
		map.put(p1, "value1");
		map.put(p2, "value2");
		map.put(p3, "value3");
		map.put(p4, "value4");
		
		System.out.println(map.size());
		System.out.println(map.get(p1));
	}

}
