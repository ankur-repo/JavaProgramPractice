package com.fis.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String args[]) {
		HashSet<String> hs = new HashSet<String>();
		LinkedHashSet<String> ls = new LinkedHashSet<>();
		TreeSet<String> ts = new TreeSet<>();
	String str[] = new String[3];
	//str["A"];
		hs.add("abc");
		hs.add(null);
		hs.add(null);
		
		ls.add("linked");
		ls.add(null);
		ls.add(null);
		
		ts.add("tree");

		hs.stream().forEach(System.out::println);
		ls.stream().forEach(System.out::println);
	}

}
