package com.ankur.lambdaexpression;

public class LabmdaAndMultithreading {

	public static void main(String args[]) {
		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(":::Child thread::::::");
			}
		};
		Thread th = new Thread(r);
		th.start();

		for (int i = 0; i < 5; i++) {
			System.out.println(":::Main thread::::");
		}
	}

}
