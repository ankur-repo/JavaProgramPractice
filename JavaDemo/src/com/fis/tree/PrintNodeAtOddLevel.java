package com.fis.tree;

public class PrintNodeAtOddLevel {

	public static void main(String args[]) {
		Node root = new Node(1);  
	    root.left = new Node(2);  
	    root.right = new Node(3);  
	    root.left.left = new Node(4);  
	    root.left.right = new Node(5);
	    root.right.right = new Node(6);
	    root.right.right.left = new Node(9);
	    root.left.right.left = new Node(7);
	    root.left.right.right = new Node(8);
	    
	    //printing node at odd level
	    printNode(root, true);
	}

	private static void printNode(Node root, boolean flag) {
		if(root == null) {
			return;
		}
		
		if(flag) {
			System.out.println(root.key);
		}
		
		printNode(root.left, !flag);
		printNode(root.right, !flag);
		
	}
}
