package com.fis.oops;

public class OverLoading {
	
	
	
	public static void main(String args[]) {
		
		Parent p = new Child();
		OverLoading obj =new OverLoading();
		obj.show(10);
		
	}

	private void show(int str) {
		System.out.println("int method");
		
	}
	
	private void show(int... str) {
		System.out.println("varargs method");
		
	}

}
