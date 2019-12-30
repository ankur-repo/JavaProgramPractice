package com.fis.multithreading;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	
	BlockingQueue queue;
	
	

	public Consumer(BlockingQueue queue) {
		this.queue = queue;
	}



	@Override
	public void run() {
		while(true) {
			
			try {
				System.out.println("Consume:::"+queue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
