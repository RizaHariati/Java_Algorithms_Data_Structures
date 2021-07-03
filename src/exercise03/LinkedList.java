package exercise03;

 class LinkedList {
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

		Node a = new Node(20);
		Node b = new Node(40);
		Node c = new Node(60);
		Node d = new Node(80);
		a.next = b;
		b.next = c;
		c.next = d;
		list.head =a
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
