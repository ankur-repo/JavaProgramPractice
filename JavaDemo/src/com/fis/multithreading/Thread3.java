package com.fis.multithreading;

public class Thread3 extends Thread{
	
	SynchronizationDemo obj;
	
	public Thread3(SynchronizationDemo obj) {
		super();
		this.obj = obj;
	}

	public void run() {
		try {
			obj.m3();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
