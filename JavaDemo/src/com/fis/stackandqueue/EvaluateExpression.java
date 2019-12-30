package com.fis.stackandqueue;

import java.util.Stack;

public class EvaluateExpression {

	public static void main(String args[]) {
		EvaluateExpression obj = new EvaluateExpression();
		System.out.println(obj.evaluate("10 + 2 * 6"));
		System.out.println(obj.evaluate("100 * 2 + 12")); 
        System.out.println(obj.evaluate("100 * ( 2 + 12 )")); 
        System.out.println(obj.evaluate("100 * ( 2 + 12 ) / 14")); 
	}

	private int evaluate(String string) {
		char[] arr = string.toCharArray();
		Stack<Integer> value = new Stack<Integer>();
		Stack<Character> ops = new Stack<Character>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				continue;
			} else if (arr[i] >= '0' && arr[i] <= '9') {
				StringBuilder sb = new StringBuilder();
				while (i < arr.length && arr[i] >= '0' && arr[i] <= '9') {
					sb.append(arr[i++]);
				}
				value.push(Integer.parseInt(sb.toString()));
			} else if (arr[i] == '(') {
				ops.push(arr[i]);
			} else if (arr[i] == ')') {
				while (ops.peek() != '(') {
					value.push(calculateValue(ops.pop(), value.pop(), value.pop()));
				}
				ops.pop();
			} else if (arr[i] == '+' || arr[i] == '-' || arr[i] == '*' || arr[i] == '/') {
				while (!ops.empty() && checkPrecedence(arr[i], ops.peek())) {
					value.push(calculateValue(ops.pop(), value.pop(), value.pop()));
				}
				ops.push(arr[i]);
			}
		}
		while (!ops.empty()) {
			value.push(calculateValue(ops.pop(), value.pop(), value.pop()));
		}
		return value.pop();
	}

	private boolean checkPrecedence(char op1, Character op2) {
		if(op2 =='(' || op2==')') {
			return false;
		}
		if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
			return false;
		}else {
			return true;
		}
		
	}

	private Integer calculateValue(Character op, Integer b, Integer a) {
		int result = 0;
		switch (op) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			if (b == 0)
				throw new ArithmeticException();
			else
				result = a / b;
			break;
		}
		return result;
	}

}
