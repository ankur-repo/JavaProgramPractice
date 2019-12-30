package com.fis.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelTranversalLineByLine {
	Node root;
	
	public static void main(String args[]) {
		LevelTranversalLineByLine obj = new LevelTranversalLineByLine();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);
		
		obj.traverseLineByLine();
	}

	private void traverseLineByLine() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		queue.add(null);
		
		while(!queue.isEmpty()) {
			Node curr = queue.poll();
			if(curr == null) {
				if(!queue.isEmpty())
				queue.add(null);
				System.out.println();
			}else {
				if(curr.left != null)
					queue.add(curr.left);
				if(curr.right != null)
					queue.add(curr.right);
				
				System.out.print(curr.key+"  ");
			}
		}
		
	}

}
