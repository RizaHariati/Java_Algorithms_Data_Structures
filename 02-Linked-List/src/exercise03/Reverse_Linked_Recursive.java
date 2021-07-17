package exercise03;


class Node {
    int data;
    Node next;
}

class Linked_List{

    public Node insert(int i, Node node) {
        if (node == null) {
            return getNewNode(i);
        }
        node.next = insert(i, node.next);
        return node;
    }

    private Node getNewNode(int i) {
        Node newNode = new Node();
        newNode.data = i;
        newNode.next = null;
        return newNode;
    }

    public void printing(Node node) {
        if (node == null) {
            System.out.println();
            return;
        }
        System.out.print(node.data + " ");
        printing(node.next);
    }
    
    public Node reverse(Node node) {
		if(node == null|| node.next == null) {
			return node;
		}
		Node prev = reverse(node.next);
		Node nextNode = node.next;
		nextNode.next = node;
		node.next = null;
		return prev;
		
		
    }

//	public Node reverse(Node node) {
//		if(node == null) {
//			return null;
//		}
//		
//		Node prev = null;
//		Node nextNode = null;
//		Node current = node;
//		while(current!=null) {
//			nextNode = current.next;
//			current.next = prev;
//			prev = current;
//			current = nextNode;
//			
//		}
//		return prev;
//	}

	

}
public class Reverse_Linked_Recursive {
    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        Node root = null;
        root = list.insert(12, root);
        root = list.insert(99, root);
        root = list.insert(37, root);
        root = list.insert(7, root);
        root = list.insert(45, root);
        System.out.println("New Print : ");
        list.printing(root);
        root = list.reverse(root);
        list.printing(root);

    }
}
