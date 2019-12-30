package com.fis.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownWorker extends Thread{
	
	private int delay;
	private CountDownLatch latch;
	
	public CountDownWorker(int delay, CountDownLatch latch) {
		super();
		this.delay = delay;
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(delay);
			latch.countDown();
			System.out.println(Thread.currentThread().getName()+":::Finished");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
