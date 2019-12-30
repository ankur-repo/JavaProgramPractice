package com.fis.multithreading;

public class ExecutorThread implements Runnable {
	private final int countUntil;

	ExecutorThread(int countUntil) {
		this.countUntil = countUntil;
	}

	@Override
	public void run() {
		long sum = 0;
		for (long i = 1; i < countUntil; i++) {
			sum += i;
		}
		System.out.println(Thread.currentThread().getName()+"  value is:: "+sum);

	}

}
