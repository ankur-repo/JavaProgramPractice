package com.fis.stackandqueue;

public class TwoStackInArray {

	int arr[], top1, top2, size;

	public TwoStackInArray(int i) {
		arr = new int[i];
		size = i;
		top1 = -1;
		top2 = size;
	}

	public void push1(int data) {
		if (top1 < top2 - 1) {
			top1++;
			arr[top1] = data;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}

	public void push2(int data) {
		if (top1 < top2 - 1) {
			top2--;
			arr[top2] = data;
		} else {
			System.out.println("stack overflow ");
			System.exit(1);
		}
	}
	
	public int pop1() {
		int x = arr[top1];
		top1--;
		return x;
	}
	
	public int pop2() {
		int x = arr[top2];
		top1++;
		return x;
	}

	public static void main(String args[]) {
		TwoStackInArray ts = new TwoStackInArray(5);
		 ts.push1(5); 
	        ts.push2(10); 
	        ts.push2(15); 
	        ts.push1(11); 
	        ts.push2(7); 
	        System.out.println("Popped element from" + 
	                           " stack1 is " + ts.pop1()); 
	        ts.push2(40); 
	        System.out.println("Popped element from" + 
	                         " stack2 is " + ts.pop2()); 
	}
}
