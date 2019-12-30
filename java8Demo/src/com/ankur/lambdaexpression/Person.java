package com.ankur.lambdaexpression;

public class Person {

	String name;
	int empNo;

	public Person(String name, int empNo) {
		this.name = name;
		this.empNo = empNo;
	}

	public String toString() {
		return "Name Is:::" + name + ":::EmpNo is:::" + empNo;
	}
}
