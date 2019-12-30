package com.fis.tree;

public class FindMaxMinInBinaryTree {
	Node root;

	public static void main(String args[]) {
		FindMaxMinInBinaryTree tree = new FindMaxMinInBinaryTree();
		tree.root = new Node(2);
		tree.root.left = new Node(7);
		tree.root.right = new Node(5);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(1);
		tree.root.left.right.right = new Node(11);
		tree.root.right.right = new Node(9);
		tree.root.right.right.left = new Node(4);

		System.out.println("Max element is:::" + tree.findMaxElement(tree.root));
		System.out.println("Min element is:::" + tree.findMinElement(tree.root));
	}

	private int findMaxElement(Node root2) {
		if (root2 == null) {
			return Integer.MIN_VALUE;
		}
		int res = root2.key;
		int lres = findMaxElement(root2.left);
		int rres = findMaxElement(root2.right);

		if (lres > res) {
			res = lres;
		}
		if (rres > res) {
			res = rres;
		}
		return res;
	}

	private int findMinElement(Node root3) {
		if (root3 == null) {
			return Integer.MAX_VALUE;
		}
		int res = root3.key;
		int lres = findMinElement(root3.left);
		int rres = findMinElement(root3.right);

		if (res > lres) {
			res = lres;
		}
		if (res > rres) {
			res = rres;
		}
		return res;
	}

}
