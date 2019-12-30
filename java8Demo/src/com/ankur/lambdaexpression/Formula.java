package com.ankur.lambdaexpression;

@FunctionalInterface
public interface Formula {

	double calculate(int a);

    static int sqrt(int a) {
        return a*a;
    }
    
    default double sqrt1(int a) {
        return Math.sqrt(a);
    }
}
