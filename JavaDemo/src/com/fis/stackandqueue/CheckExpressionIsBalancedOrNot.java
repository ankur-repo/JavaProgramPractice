package com.fis.stackandqueue;

import java.util.Stack;

public class CheckExpressionIsBalancedOrNot {

	public static void main(String args[]) {
		CheckExpressionIsBalancedOrNot obj = new CheckExpressionIsBalancedOrNot();
		String str = "{()}[(])";
		boolean flag = obj.vlidateExpression(str);
		if(flag)
			System.out.println("Balanced expression");
		else
			System.out.println("Not Balanced expression");
	}

	private boolean vlidateExpression(String str) {
		Stack stack = new Stack();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty()) {
					return false;
				} else if (!isMatchingPair((char) stack.pop(), ch)) {
					return false;
				}
			}
		}
		if(stack.isEmpty())
			return true;
		else
			return false;

	}

	private boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

}
