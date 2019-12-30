package com.ankur.lambdaexpression1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import org.omg.Messaging.SyncScopeHelper;

public class LambdaDemo {

	public static void main(String args[]) {
		Predicate<Integer> p = i->i%2==0;
		Function<Integer,Integer> f = i->i*2;
		Consumer<Integer> c = i-> System.out.println(i);
		
		System.out.println(p.test(9));
		System.out.println(f.apply(9));
		c.accept(10);
	}
}
