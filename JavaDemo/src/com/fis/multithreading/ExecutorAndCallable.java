package com.fis.multithreading;

import java.util.concurrent.Callable;

public class ExecutorAndCallable implements Callable<Integer> {

	private int count;

	public ExecutorAndCallable(int count) {
		this.count = count;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += i;
		}
		return sum;
	}

}
