package exercise03;

public class LinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}


	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.head = new Node(20);
		list.head.next = new Node(40);
		list.head.next.next = new Node(60);
		list.head.next.next.next = new Node(80);
		printing(head);
		head = list.reverse(head);
		printing(head);
	}


	static void printing(Node node) {
		while (node.next != null) {
			System.out.print(node.data + " => ");
			node = node.next;
		}
		System.out.print(node.data);
		System.out.println();
	}


	Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next_node = null;

		while (current != null) {
			next_node = current.next;
			current.next = prev;
			prev = current;
			current = next_node;
		}
		node = prev;
		return node;
	}
	
}
