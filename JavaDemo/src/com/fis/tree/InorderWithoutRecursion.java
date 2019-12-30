package com.fis.tree;

import java.util.Stack;

public class InorderWithoutRecursion {

	Node root;

	public static void main(String args[]) {
		InorderWithoutRecursion obj = new InorderWithoutRecursion();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);

		obj.inorderTraversal();
	}

	private void inorderTraversal() {
		Stack<Node> stack = new Stack<Node>();
		Node current = root;
		while (current != null || stack.size() > 0) {

			while (current != null) {
				stack.push(current);
				current = current.left;
			}
			
			current = stack.pop();
			System.out.println("::: "+current.key);
			
			current = current.right;

		}

	}

}
