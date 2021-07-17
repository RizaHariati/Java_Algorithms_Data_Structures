//
//class Node{
//	int data;
//	Node next;
//	Node(int d){
//		data =d;
//		next = null;
//	}
//}
//
//class Linked_List{
//	Node head;
//
//	public void printing(Node node) {
//		while(node.next != null) {
//			System.out.print(node.data + " => ");
//			node = node.next;
//		}
//		System.out.println(node.data);
//		System.out.println();
//	}
//	
//	public Node reverse(Node node) {
//		if(node == null||node.next == null) {
//			return node;
//		}
//		Node prev = reverse(node.next);
//		Node nodeNext = node.next;
//		node.next = null;
//		nodeNext.next = node;
//		
//		return prev;
//	}
//
////	public Node reverse(Node node) {
////		Node prev = null;
////		Node nodeNext = null;
////		Node current = node;
////		while(current != null){
////			nodeNext = current.next;
////			current.next =prev;
////			prev = current;
////			current= nodeNext;
////		}
////		node = prev;
////		return node;
////	}
//}
//
//public class Reverse_Linked_List {
//
//	public static void main(String[] args) {
//		
//		Linked_List list = new Linked_List();
//		list.head = new Node(20);
//		list.head.next = new Node(40);
//		list.head.next.next = new Node(60);
//		list.head.next.next.next = new Node(80);
//		list.printing(list.head);
//		list.head = list.reverse(list.head);
//		list.printing(list.head);
//	}
//
//}
