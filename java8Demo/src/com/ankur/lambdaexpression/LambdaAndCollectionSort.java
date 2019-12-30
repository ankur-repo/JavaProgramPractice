package com.ankur.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaAndCollectionSort {

	public static void main(String args[]) {
		// ArrayList<Integer> ls = new ArrayList<Integer>();
		ArrayList<Person> ls = new ArrayList<Person>();
		/*
		 * ls.add(40); ls.add(10); ls.add(1000); ls.add(20); ls.add(05); ls.add(02);
		 * ls.add(100);
		 */

		ls.add(new Person("Jai", 500));
		ls.add(new Person("Ram", 100));
		ls.add(new Person("Ank", 1000));
		ls.add(new Person("Ravi", 300));
		ls.add(new Person("Puja", 50));

		System.out.println("before sorting:::" + ls);
		// Collections.sort(ls, (a,b)-> a > b? 1:(a<b)?-1:0);
		Collections.sort(ls, (a, b) -> (a.empNo > b.empNo) ? -1 : (a.empNo < b.empNo) ? 1 : 0);
		System.out.println("After sorting:::" + ls.toString());
		Collections.sort(ls, (a, b) -> a.name.compareTo(b.name));
		System.out.println("After second sort:::::" + ls.toString());
	}

}
