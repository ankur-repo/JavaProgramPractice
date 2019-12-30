package com.fis.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementation {
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	public static void main(String args[]) {
		StackImplementation obj = new StackImplementation();
		obj.push(100);
		obj.push(200);
		/*obj.push(300);
		obj.push(400);*/
		
		System.out.println("Stack element is::"+obj.peek());
		System.out.println("Stack element is::"+obj.peek());
		System.out.println("Stack element is::"+obj.peek());
		System.out.println("Stack element is::"+obj.peek());
		
	}

	public void push(int x) {

		while (q1.size() > 0) {
			q2.add(q1.peek());
			q1.remove();
		}

		q1.add(x);

		while (q2.size() > 0) {
			q1.add(q2.peek());
			q2.remove();
		}
	}

	public int peek() {
		int num = q1.peek();
		q1.remove();
		return num;
	}
	
	
}
