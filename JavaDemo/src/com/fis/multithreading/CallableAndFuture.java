package com.fis.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {
	private static final int NOTHREAD = 10;

	public static void main(String args[]) {
		ExecutorService service = Executors.newFixedThreadPool(NOTHREAD);
		List<Future> list = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			ExecutorAndCallable work = new ExecutorAndCallable(10+i);
			Future<Integer> future = service.submit(work);
			list.add(future);
		}
		System.out.println("List Size:::: "+list.size());
		for(Future<Integer> f: list) {
			try {
				System.out.println("value is  "+f.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		service.shutdown();
	}

}
