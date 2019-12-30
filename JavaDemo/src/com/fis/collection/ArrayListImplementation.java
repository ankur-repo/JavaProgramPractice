package com.fis.collection;

import java.util.Arrays;

public class ArrayListImplementation {
	private Object elementData[];
	int size = 0;

	public ArrayListImplementation() {
		this.elementData = new Object[10];
	}

	public ArrayListImplementation(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new IllegalArgumentException("Illegal Capacity::" + initialCapacity);
		}
		this.elementData = new Object[initialCapacity];
	}

	public boolean add(Object e) {
		ensureCapacity(size + 1);
		elementData[size++]= e;
		return true;

	}

	private void ensureCapacity(int minCapacity) {
		int oldCapacity = elementData.length;
		if (minCapacity > oldCapacity) {
			int newCapacity = (oldCapacity * 3) / 2 + 1;
			elementData = Arrays.copyOf(elementData, newCapacity);
		}

	}
	
	public int size() {
		return this.size;
	}
	
	public static void main(String args[]) {
		ArrayListImplementation list = new ArrayListImplementation(5);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		
		System.out.println(list.size());
	}
}
