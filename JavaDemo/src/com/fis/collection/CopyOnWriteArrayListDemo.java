package com.fis.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	
	public static void main(String args[]) {
		CopyOnWriteArrayList<Integer> cp = new CopyOnWriteArrayList<>();
		cp.add(10);
		cp.add(20);
		cp.add(30);
		cp.add(40);
		
		Iterator<Integer> it = cp.iterator();
		while(it.hasNext()) {
			int num = it.next();
			if(num == 30) {
				cp.add(100);
			}
			System.out.println("cp values are:::::"+cp);
		}
		
	}

}
