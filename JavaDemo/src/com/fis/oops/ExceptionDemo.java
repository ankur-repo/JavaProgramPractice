package com.fis.oops;

public class ExceptionDemo {

	public static void main(String args[]) {
		ExceptionDemo obj = new ExceptionDemo();
		System.out.println("::::::"+obj.show());
	}
	
	public int show() {
		try {
			int i = 10/0;
		}catch (Exception e) {
			return 1;
		}finally {
			//return 2;
		}
		return 0;
	}
}
