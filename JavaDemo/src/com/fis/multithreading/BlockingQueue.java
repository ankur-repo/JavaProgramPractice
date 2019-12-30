package com.fis.multithreading;

public interface BlockingQueue<T> {
	boolean offer(T object, long millisecond)throws Exception ;
	T take()throws Exception ;

}
