package com.fis.multithreading;

public class Thread1 extends Thread{
	
	public void run() {
		try {
			SynchronizationDemo.m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
