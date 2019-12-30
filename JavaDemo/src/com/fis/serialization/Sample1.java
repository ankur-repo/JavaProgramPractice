package com.fis.serialization;

public class Sample1 {
	int i;

	// parameterized constructor
	public Sample1(int i) {
		this.i = i;
	}

	// default constructor
	// this constructor must be present
	// otherwise we will get runtime exception
	public Sample1() {
		i = 50;
		System.out.println("A's class constructor called");
	}
}
