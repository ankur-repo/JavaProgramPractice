package com.fis.tree;

public class DeleteTree {
	Node root;

	public static void main(String args[]) {
		DeleteTree tree = new DeleteTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

	
		tree.deleteTree(tree.root);
		tree.root = null;
		System.out.println("Tree deleted");
	}

	private void deleteTree(Node root2) {
		root2 = null;

	}

}
