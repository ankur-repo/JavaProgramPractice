package com.fis.linkedlist;

public class LinkedList {
	Node head;

	public static void main(String args[]) {
		LinkedList obj = new LinkedList();
		obj.head = new Node(10);
		obj.head.next = new Node(20);
		obj.head.next.next = new Node(30);
		obj.head.next.next.next = new Node(40);
		System.out.println("before reverse  ");
		obj.printList(obj.head);

		System.out.println("After reverse  ");
		obj.printList(reverse(obj.head));

	}

	private static Node reverse(Node head2) {
		Node curr = head2;
		Node prev = null;
		Node next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;

	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
}
