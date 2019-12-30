package com.fis.stackandqueue;

import java.util.Stack;

public class QueueImplementation {
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	public static void main(String args[]) {
		QueueImplementation obj = new QueueImplementation();
		/*
		 * obj.enqueue(10); obj.enqueue(20); obj.enqueue(30); obj.enqueue(40);
		 * 
		 * System.out.println("Elements are::::"+obj.dequeue());
		 * System.out.println("Elements are::::"+obj.dequeue());
		 * System.out.println("Elements are::::"+obj.dequeue());
		 * System.out.println("Elements are::::"+obj.dequeue());
		 */

		/*obj.enqueue1(10);
		obj.enqueue1(20);
		obj.enqueue1(30);
		obj.enqueue1(40);

		System.out.println("@@@@@" + obj.s1);
		System.out.println("Elements are::::" + obj.dequeue1());
		System.out.println("Elements are::::" + obj.dequeue1());
		System.out.println("Elements are::::" + obj.dequeue1());
		System.out.println("Elements are::::" + obj.dequeue1());
		System.out.println("@@@@@" + obj.s2);*/
		
		obj.enqueue2(10);
		obj.enqueue2(20);
		obj.enqueue2(30);
		obj.enqueue2(40);

		System.out.println("@@@@@" + obj.s1);
		System.out.println("Elements are::::" + obj.dequeue2());
		System.out.println("Elements are::::" + obj.dequeue2());
		System.out.println("Elements are::::" + obj.dequeue2());
		System.out.println("Elements are::::" + obj.dequeue2());
		System.out.println("@@@@@" + obj.s2);

	}

	public void enqueue(int x) {
		while (s1.size() > 0) {
			s2.add(s1.peek());
			s1.pop();
		}

		s1.add(x);

		while (s2.size() > 0) {
			s1.add(s2.peek());
			s2.pop();
		}
	}

	public int dequeue() {
		int num = s1.peek();
		s1.pop();
		return num;
	}

	public void enqueue1(int x) {
		s1.add(x);
	}

	public int dequeue1() {
		if (s2.empty()) {
			while (s1.size() > 0) {
				s2.add(s1.peek());
				s1.pop();
			}
		}
		int num = s2.peek();
		s2.pop();
		return num;
	}
	
	
	public void enqueue2(int x) {
		s2.add(x);

		while (!s1.isEmpty()) {
			s2.add(s1.peek());
			s1.pop();
		}
		
		Stack<Integer> s = s1;
		s1 = s2;
		s2 = s;
	}

	public int dequeue2() {
		int num = s1.peek();
		s1.pop();
		return num;
	}
}
