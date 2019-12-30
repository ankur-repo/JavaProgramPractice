package com.fis.tree;

public class DistanceFromRootToGivenNode {
	Node root;

	public static void main(String args[]) {
		DistanceFromRootToGivenNode obj = new DistanceFromRootToGivenNode();
		obj.root = new Node(5);
		obj.root.left = new Node(10);
		obj.root.right = new Node(15);
		obj.root.left.left = new Node(20);
		obj.root.left.right = new Node(25);
		obj.root.left.right.right = new Node(45);
		obj.root.right.left = new Node(30);
		obj.root.right.right = new Node(35);

		System.out.println("distnace is:::: " + obj.printDistance(obj.root, 45));
	}

	private int printDistance(Node node, int x) {
		if (node == null) {
			return -1;
		}
		int dist = -1;
		if (node.key == x || (dist = printDistance(node.left, x)) >= 0 || (dist = printDistance(node.right, x)) >= 0) {
			return dist + 1;
		}
		return dist;

	}

}
