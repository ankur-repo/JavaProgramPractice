package com.fis.oopsconcept;

public class Child{
	
	Child(){
		System.out.println("Constructor");
	}
	
	static {
		System.out.println("static");
	}
	
	public void show() {
		System.out.println("child class");
	}

	
	public static void main(String args[]) {
		Child  p = new Child();
		p.show();
	}
}
