package exercise01;

class Node {
    int i;
    Node next;
}

class Linked {

    public Node insertFront(int i, Node node) {
        Node a = getNewNode(i);
        a.next = node;
        
        return a;
    }
    public Node insert(int i, Node node) {
        if (node == null) {
            return getNewNode(i);
        } else {
            node.next = insert(i, node.next);
            return node;
        }
        
    }

    private Node getNewNode(int i) {
        Node node = new Node();
        node.i = i;
        node.next = null;
        return node;
    }

    public void printing(Node node) {
        if (node == null) {
            System.out.println();
            return;
        }
        System.out.print(node.i + " ");
        printing(node.next);
    }

    public Node insertNewNode(int position, int value, Node node) {
        if (position < 1) {
            System.out.println("position can't be smaller than one");
            return node;
        }
        if (node == null && position > 1) {
            System.out.println("position is bigger than the node length");
            return node;
        }
        if (node == null && position == 1) {
            return getNewNode(value);
        }
        if (position == 1) {
            Node a = getNewNode(value);
            a.next = node;
            return a;
        }
        node.next = insertNewNode(position - 1, value, node.next);
        return node;
    }

   
    
  
}

/**
 * A02_Linked_Basic_2
 */
public class A02_Linked_Basic_2 {

    public static void main(String[] args) {
        Linked list = new Linked();
        Node root = null;
        root = list.insert(12, root);
        root = list.insert(99, root);
        root = list.insert(37, root);
        list.printing(root);
        int position = 1;
        int value = 5;
        root = list.insertNewNode(position, value, root);
        // root = list.insertFront(5, root);
        list.printing(root);
       
    }
 
}