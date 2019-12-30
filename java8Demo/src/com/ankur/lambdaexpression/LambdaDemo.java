package com.ankur.lambdaexpression;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo {

	public static void main(String args[]) {
		Function<Integer, Integer> f = (i) -> i * i;
		Predicate<Integer> p = (n) -> n % 2 == 0;
		System.out.println(":::Function is:::::"+f.apply(8));
		System.out.println(":::Predicate is::::"+p.test(6));
	}

}
