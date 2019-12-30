package com.fis.generaljava;

public class Honda extends Bike{

	int speed = 50;
	
	public static void main(String args[]) {
		Bike b = new Honda();
		Honda h = new Honda();
		System.out.println(b.speed);
		System.out.println(h.speed);
	}
}
