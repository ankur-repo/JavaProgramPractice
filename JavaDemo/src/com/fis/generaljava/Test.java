package com.fis.generaljava;

import java.util.stream.Stream;

public class Test {
	
	public static void main(String args[]) {
		Stream.iterate((1), t->t+1).limit(10).forEach(System.out::println);
		Student st = new Student(100,"ABC","INDIAN");
		Student st1 = new Student(100,"ABCD","INDIAN");
		System.out.println("st hashCode "+ st.hashCode());
		System.out.println("st1 hashCode "+ st1.hashCode());


	}

}
