
class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

class Linked {
	Node head;

	public Node push(Node root, int i) {
		Node head = new Node(i);
		Node node = root;
		while (node.next != null) {
			node = node.next;
		}
		node.next = head;
		return root;
	}

	public void printing(Node node) {
		while (node.next != null) {
			System.out.print(node.data + " =>");
			node = node.next;
		}
		System.out.print(node.data);
		System.out.println();
	}

	public Node removeDuplicate(Node node) {
		if(node == null) {
			return null;
		}
		node.next = removeDuplicate(node.next);
		if(node.next != null && node.next.data == node.data) {
			Node temp = node.next;
			return temp;
		
		}
		
		return node;
		
	}
//	public Node removeDuplicate(Node node) {
//		Node root = node;
//		while(root.next!= null){
//			if(root.data == root.next.data) {
//				if(root.next.next== null) {
//					root.next = null;
//				}else {
//					root.next = root.next.next;
//				}
//				
//			}else {
//				root = root.next;
//			}
//				
//		}
//		return node;
//		
//	}

}

public class Remove_Duplicate_in_Linked {

	public static void main(String[] args) {
		Linked list = new Linked();
		list.head = new Node(12);
		list.head = list.push(list.head, 12);
		list.head = list.push(list.head, 12);
		list.head = list.push(list.head, 12);
		list.head = list.push(list.head, 13);
		list.head = list.push(list.head, 14);
		list.head = list.push(list.head, 15);
		list.head = list.push(list.head, 15);
		list.head = list.push(list.head, 15);
		list.head = list.push(list.head, 15);
		list.head = list.push(list.head, 16);
		list.head = list.push(list.head, 17);
		list.head = list.push(list.head, 17);
		list.printing(list.head);
		list.head = list.removeDuplicate(list.head);
		list.printing(list.head);
	}

}
