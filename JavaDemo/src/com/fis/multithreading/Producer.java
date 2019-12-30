package com.fis.multithreading;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	BlockingQueue  queue;
	
	
	public Producer(BlockingQueue queue) {
		this.queue = queue;
	}


	@Override
	public void run() {
		for(int i = 0; i< 10; i++) {
			System.out.println("Produced:: "+i);
			try {
				
				queue.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
