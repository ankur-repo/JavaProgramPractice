package com.fis.cloning;

public class SingletonClass {

	int a;
	int b;
	private static SingletonClass singletonInstance;

	private SingletonClass() {
		a = 10;
		b = 20;
	}

	public static SingletonClass getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new SingletonClass();
		}
		return singletonInstance;
	}
}
