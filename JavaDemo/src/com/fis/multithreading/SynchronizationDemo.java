package com.fis.multithreading;

public class SynchronizationDemo {

	public synchronized static void m1() throws InterruptedException {
		System.out.println("Thread name:: " + Thread.currentThread().getName());
		for (int i = 0; i < 20; i++) {
			System.out.println("Inside method m1()");
		}
		System.out.println(":::::::::m1() end:::::::::::");
	}

	public synchronized static void m2() throws InterruptedException {
		System.out.println("Thread name:: " + Thread.currentThread().getName());
		for (int i = 0; i < 20; i++) {
			System.out.println("Inside method m2()");
		}
		System.out.println(":::::::::m2() end:::::::::::");
	}

	public synchronized void m3() throws InterruptedException {
		System.out.println("Thread name:: " + Thread.currentThread().getName());
		// Thread.sleep(500);
		for (int i = 0; i < 20; i++) {
			System.out.println("Inside method m3()");
		}
		System.out.println(":::::::::m3() end:::::::::::");
	}

	public synchronized void m4() throws InterruptedException {
		System.out.println("Thread name:: " + Thread.currentThread().getName());
		// Thread.sleep(500);
		for (int i = 0; i < 20; i++) {
			System.out.println("Inside method m4()");
		}
		System.out.println(":::::::::m4() end:::::::::::");
	}

}
