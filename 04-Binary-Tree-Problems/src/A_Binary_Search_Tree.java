
class Node {
	int data;
	Node right;
	Node left;

	Node(int d) {
		data = d;
		right = left = null;
	}
}

class BST {
	Node head;

	public int sumNodes(Node node) {
		if (node == null) {
			return 0;
		}

		return node.data + sumNodes(node.left) + sumNodes(node.right);

	}
	static int max= 1;
	public int oddEven(Node node) {
		if (node == null) {
			return 0;
		}
		
		return node.data -(oddEven(node.right) + oddEven(node.left));
	}
}

public class A_Binary_Search_Tree {
	public static void main(String[] args) {
		BST tree = new BST();
		tree.head = new Node(8);
		tree.head.left = new Node(3);
		tree.head.right = new Node(10);
		tree.head.left.left = new Node(1);
		tree.head.left.right = new Node(6);
		tree.head.left.right.left = new Node(4);
		tree.head.left.right.right = new Node(7);
		tree.head.right.right = new Node(14);
		tree.head.right.right.left = new Node(13);

		int sum = tree.sumNodes(tree.head);
		int difference = tree.oddEven(tree.head);
		System.out.println(difference);
	}
}