package com.fis.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		int x = 10;
		int y = 20;
		/*
		 * list.add("A"); list.add("B");
		 */
		System.out.println("Size of list before update " + list.size());

		// updateList(list);
		updateList();

		System.out.println("Size of list after update " + list.size());

		increment(x, y);
		System.out.println("x "+x+" y "+y);
	}

	private static void increment(int x, int y) {
		x++;
		y++;
		
	}

	private static void updateList() {
		List<String> list = new ArrayList<String>();
		list.add("c");
		System.out.println("Size of list before update " + list.size());

		updateList1(list);

		System.out.println("Size of list after update " + list.size());
	}

	private static void updateList1(List<String> list) {
		list.add("a");
	}

}
