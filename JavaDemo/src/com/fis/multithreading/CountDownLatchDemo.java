package com.fis.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

	public static void main(String args[]) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(4);
		CountDownWorker worker1 = new CountDownWorker(1000, latch);
		CountDownWorker worker2 = new CountDownWorker(1000, latch);
		CountDownWorker worker3 = new CountDownWorker(1000, latch);
		CountDownWorker worker4 = new CountDownWorker(1000, latch);

		worker1.start();
		worker2.start();
		worker3.start();
		worker4.start();

		latch.await();

		System.out.println(Thread.currentThread().getName() + "::Finished");
	}

}
