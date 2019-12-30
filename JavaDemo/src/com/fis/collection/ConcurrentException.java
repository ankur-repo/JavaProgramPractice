package com.fis.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.management.ImmutableDescriptor;

public class ConcurrentException {

	public static void main(String args[]) {
		List list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		List list1 = Collections.singletonList(list);
		List list2 = Collections.unmodifiableList(list);
		
		list.add(200);
		//list2.add(200);
		//list1.add(100);
		System.out.println("list2::::::::"+list2);
		System.out.println("list1::::::::"+list1);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int num = it.next();
			if(num == 30)
				list.add(60);
			System.out.println("elements are:::::"+num);
		}
	}
}
