package com.fis.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	private static final int NOTHREAD = 10;
	public static void main(String args[]) {
		
		ExecutorService service = Executors.newFixedThreadPool(NOTHREAD);
		for (int i = 0; i < 50; i++) {
            Runnable worker = new ExecutorThread(10);
            service.execute(worker);
        }
		service.shutdown();
        // Wait until all threads are finish
		//service.awaitTermination();
        System.out.println("Finished all threads");
	}

}
