package com.fis.multithreading;

public class Thread2 extends Thread{
	
	public void run() {
		try {
			SynchronizationDemo.m2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
