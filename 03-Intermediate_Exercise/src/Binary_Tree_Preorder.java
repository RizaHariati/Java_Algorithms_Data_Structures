//class Node{
//	int data;
//	Node right;
//	Node left;
//	
//	Node(int d){
//		data = d;
//		right = left = null;
//	}
//}
//
//class Bin_Tree{
//	Node head;
//
//	public void preOrder(Node node) {
//		if (node == null) {
//			return;
//		}
//		
//		System.out.print(node.data + " ");	
//		preOrder(node.left);
//		preOrder(node.right);
//		return;
//	}
//
//}
//public class Binary_Tree_Preorder {
//	public static void main(String[] args) {
//		Bin_Tree tree = new Bin_Tree();
//		tree.head = new Node(10);
//		tree.head.left = new Node(20);
//		tree.head.right = new Node(30);
//		tree.head.left.left = new Node(40);
//		tree.head.left.right = new Node(50);
//		
//		tree.preOrder(tree.head);
//	}
//
//}