package com.fis.tree;

public class BinaryTree {
	Node root;

	public BinaryTree() {
		this.root = null;
	}

	public void printInorder(Node node) {
		if (node == null) {
			return;
		}

		printInorder(node.left);

		System.out.print(node.key + " ");

		printInorder(node.right);
	}
	
	public void printPreOrder(Node node) {
		if(node == null) {
			return;
		}
		

		System.out.print(node.key+" ");

		printPreOrder(node.left);
		
		printPreOrder(node.right);
		
	}
	
	public void printPostOrder(Node node) {
		if(node == null) {
			return;
		}
		
		
		
		printPostOrder(node.left);
		
		printPostOrder(node.right);
		
		System.out.print(node.key+" ");
	}
	
	public static void main(String args[]) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.root = new Node(1);
		binaryTree.root.left = new Node(2);
		binaryTree.root.right = new Node(3);
		binaryTree.root.left.left = new Node(4);
		binaryTree.root.left.right = new Node(5);
		
		System.out.println("InOrder Traversel of binary tree");
		binaryTree.printInorder(binaryTree.root);
		
		System.out.println("\npreOrder Traversel of binary tree");
		binaryTree.printPreOrder(binaryTree.root);
		
		System.out.println("\npostOrder Traversel of binary tree");
		binaryTree.printPostOrder(binaryTree.root);
	}
}
