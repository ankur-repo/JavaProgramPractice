package com.fis.generaljava;

public class ExceptionCheck {
	public static void main(String args[]) {
		System.out.println(show());
	}

	private static int show() {
		try {
			int a=0, b= 100;
			int c = b/a;
			return 0;
		}catch(Exception e) {
			return -1;
		}finally {
			return -2;
		}
	}

}
