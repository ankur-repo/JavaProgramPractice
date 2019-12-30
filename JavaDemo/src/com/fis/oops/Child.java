package com.fis.oops;

import com.fis.collection.Demo;

public class Child extends Parent{

	public void show() {
		System.out.println("Child");
		//return 0;
	}
	
	private void display() {
		System.out.println("Inside display");
		
	}
	
	public static void main(String args[]) {
		//Demo d = new Demo();
		Child obj = new Child();
		Parent pobj = new Child();
		
		obj.show();
		obj.display();
		obj.parentShow();
		
	    pobj.show();
	    pobj.parentShow();
		
	}

	
}
