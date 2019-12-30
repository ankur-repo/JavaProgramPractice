package com.fis.collection;

import java.util.TreeSet;

import com.fis.pojoclass.Employee;

public class TreeSetDemo {
	
	public static void main(String args[]) {
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(new Employee("Ankur",100));
		ts.add(new Employee("Vijay",20));
		ts.add(new Employee("Sonu",50));
		ts.add(new Employee("Ajay",1000));
		
		System.out.println(ts.toString());
	}
	
	

}
