package com.fis.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplWithSingleQueue {
	Queue<Integer> q = new LinkedList<Integer>();

	public static void main(String args[]) {
		StackImplWithSingleQueue obj = new StackImplWithSingleQueue();
		obj.push(100);
		obj.push(200);
		obj.push(300);
		obj.push(400);
		obj.push(500);

		System.out.println("elements are" + obj.pop());
		System.out.println("elements are" + obj.pop());
		System.out.println("elements are" + obj.pop());
		System.out.println("elements are" + obj.pop());
		System.out.println("elements are" + obj.pop());

	}

	public void push(int x) {
		int size = q.size();
		q.add(x);

		for (int i = 0; i < size; i++) {
			int rmEle = q.remove();
			q.add(rmEle);
		}
	}

	public int pop() {
		if (q.isEmpty())
			System.out.println("queue is empty");
		int ele = q.remove();
		return ele;
	}
}
