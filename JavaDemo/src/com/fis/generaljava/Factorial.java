package com.fis.generaljava;

public class Factorial {

	public static void main(String args[]) {
		Factorial obj = new Factorial();
		System.out.println(obj.findFactorial(5));
	}

	private int findFactorial(int num) {
		if (num == 0)
			return 1;
		int i = num * findFactorial(num - 1);
		return i;
	}
}
