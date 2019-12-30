package com.fis.tree;

import java.util.ArrayList;

public class PathFromRootToGivenNode {

	public static void main(String args[]) {
		PathFromRootToGivenNode obj = new PathFromRootToGivenNode();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		int x = 5;
		obj.findPath(root, x);
	}

	private void findPath(Node root, int x) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if (hasPath(root, arr, x)) {
			for (int i = 0; i < arr.size()-1; i++)
				System.out.print(arr.get(i) + "->");
			System.out.print(arr.get(arr.size() - 1));
		}

	}

	private boolean hasPath(Node root, ArrayList<Integer> arr, int x) {
		if (root == null) {
			return false;
		}
		arr.add(root.key);
		
		if (root.key == x) {
			return true;
		}

		if (hasPath(root.left, arr, x) || hasPath(root.right, arr, x)) {
			return true;
		}

		arr.remove(arr.size() - 1);
		return false;
	}

}
