package com.ankur.lambdaexpression;

public class Lambda {

	 public static void main(String[] args) {
		    Formula formula = (a) -> Formula.sqrt(a);
		        System.out.println(formula.calculate(100));
		    }
}
