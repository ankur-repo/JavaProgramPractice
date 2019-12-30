package com.ankur.lambdaexpression;

public class LambdaDemo1 {

	public static void main(String args[]) {
		InterfaceDemo infrObj = (a, b) -> (a + b);
		System.out.println(":::::Sum:::::"+infrObj.add(10, 20));
	}

}
