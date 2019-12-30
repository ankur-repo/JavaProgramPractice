package com.ankur.collectionstream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciSeries {

	public static void main(String args[]) {
		FibonacciSeries obj = new FibonacciSeries();
		// obj.printFibonacciSeries(10);
		/*
		 * int first = 0; int second = 1; System.out.println(first);
		 * System.out.println(second); obj.printFibonacci(10,0,1);
		 */
		//System.out.println(obj.getFibonacci(10));
		obj.fibonacciInJava8(); 
	}

	private void printFibonacciSeries(int count) {
		int first = 0;
		int second = 1;
		System.out.println(first);
		System.out.println(second);
		for (int i = 1; i <= count - 2; i++) {
			int third = first + second;
			System.out.println(third);
			first = second;
			second = third;
		}

	}

	private void printFibonacci(int count, int first, int second) {
		if (!(count > 2))
			return;
		int third = first + second;
		System.out.println(third);
		first = second;
		second = third;
		printFibonacci(count - 1, first, second);
	}

	public static int getFibonacci(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		}
		return getFibonacci(n - 1) + getFibonacci(n - 2);
	}

	//using java8
	public void fibonacciInJava8() {
		Stream.iterate(new int[]{0,1},p-> new int[] {p[1],p[0]+p[1]})
		.limit(10)
		.forEach(p->System.out.println(p[0]));
	
	}
	
}
