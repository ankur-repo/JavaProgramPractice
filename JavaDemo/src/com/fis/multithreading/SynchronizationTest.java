package com.fis.multithreading;

public class SynchronizationTest {
	public static void main(String args[]) {
		SynchronizationDemo obj = new SynchronizationDemo();
		SynchronizationDemo obj2 = new SynchronizationDemo();
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3(obj);
		Thread4 t4 = new Thread4(obj);
		
		t1.start();
		t2.start();
		t3.start();
		//t4.start();
		
	}

}
