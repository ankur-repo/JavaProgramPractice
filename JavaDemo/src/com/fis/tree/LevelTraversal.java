package com.fis.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelTraversal {

	Node root;

	public static void main(String args[]) {
		LevelTraversal obj = new LevelTraversal();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);

		obj.levelOrder();
	}

	private void levelOrder() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (queue.size() > 0) {
			Node current = queue.poll();
			System.out.println(current.key);
			if(current.left!= null) {
				queue.add(current.left);
			}
			if(current.right !=null) {
				queue.add(current.right);
			}
		}
	}

}
