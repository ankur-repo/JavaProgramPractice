package com.fis.collection;

import java.util.HashMap;
import java.util.HashSet;

import com.fis.pojoclass.Student;

public class MapDemo {
	
	public static void main(String args[]) {
		HashSet<Student> hs = new HashSet<Student>();
		HashMap<Student,String> hm = new HashMap<Student, String>();
		hs.add(new Student("ABC", 10));
		hs.add(new Student("ABC", 10));
		System.out.println(hs.size());
		
		Student obj = new Student("RAM", 100);
		hm.put(obj, "XYZ");
		obj.setName("ANKUR");
		
		System.out.println("::::::"+hm.get(obj));
		
	}

}
