package com.fis.multithreading;

public class Thread4 extends Thread{
	
	SynchronizationDemo obj;

	public Thread4(SynchronizationDemo obj) {
		super();
		this.obj = obj;
	}
	
	public void run() {
		try {
			obj.m4();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
