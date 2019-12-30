package com.fis.multithreading;

public class BlockingQueueTest {
	public static void main(String args[]) throws Exception {
		BlockingQueueImpl<String> obj = new BlockingQueueImpl<>();
		boolean flag = obj.offer("ABC", 100);
		if(flag)
			System.out.println("element added");
		String str = obj.take();
		System.out.println(str);
	}

}
