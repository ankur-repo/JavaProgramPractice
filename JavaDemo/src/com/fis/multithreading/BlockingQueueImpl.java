package com.fis.multithreading;

import java.util.ArrayList;
import java.util.List;

public class BlockingQueueImpl<T> implements BlockingQueue<T> {
	List<T> list = new ArrayList<T>();
	int size = 10;

	public synchronized boolean offer(T object, long millisecond) throws Exception {
		boolean flag = false;
		while (size == list.size()) {
			wait(millisecond);
		}
		if (list.size() == 0) {
			notifyAll();
		} 
			list.add(object);
			flag = true;
	
		return flag;
	}

	public synchronized T take() throws Exception {
		T t;
		while (list.size() == 0) {
			wait();
		}
		if(list.size() ==size) {
			notifyAll();
		}
		t = list.remove(0);
		return t;
	}
}
