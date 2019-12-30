package com.fis.tree;

public class SizeOfTree {
	Node root;

	public static void main(String args[]) {
		SizeOfTree obj = new SizeOfTree();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);

		System.out.println(obj.findSize(obj.root));
	}

	private int findSize(Node root2) {
		if (root2 == null) {
			return 0;
		} else {
			return findSize(root2.left) + 1 + findSize(root2.right);
			
		}

	}

}
