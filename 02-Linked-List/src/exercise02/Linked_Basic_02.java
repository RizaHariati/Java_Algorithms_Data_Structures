package exercise02;


class Node {
    int i;
    Node next;
}

class Linked_List {

    public Node insert(int i, Node node) {
        if(node == null){
            return getNewNode(i);
        } else {
            node.next = insert(i, node.next);
            return node;
        }
       
    }

    private Node getNewNode(int i) {
        Node newNode = new Node();
        newNode.i = i;
        newNode.next = null;
        return newNode;
    }

    public void printing(Node node) {
        if (node == null) {
            System.out.println();
            return;
        }
        System.out.print(node.i + " ");
        printing(node.next);
    }

    public Node insertFront(int i, Node node) {
        Node newNode = new Node();
        newNode.i = i;
        newNode.next = node;
       
        return newNode;
    }

    public Node insertNewNode(int position, int value, Node node) {
        if (position < 1) {
            System.out.println("position can't be less than 1");
            return node;
        }
        if (node == null && position > 1) {
            System.out.println("position can't be larger than link's length");
            return node;
        }
        if (node == null && position == 1) {
            return getNewNode(value);
        }
        if (position == 1) {

            return insertFront(value, node);
        }
        node.next = insertNewNode(position - 1, value, node.next);
        return node;
    }

    public Node deleteLast(Node node) {
        if (node == null || node.next == null) {
            return null;
       }
       
        Node temp = node;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return node;
    }

    public Node deleteFirst(Node node) {
        if (node == null) {
            return null;
        }
        return node.next;
    }

    public Node deleteNode(int position, Node node) {
      
        if (position < 1) {
            System.out.println("position can't be less than 1");
            return node;
        }
        if(node == null && position > 1){
             System.out.println("position can't be larger than link's length");
            return node;
        }
        if (position == 1) {
            return node.next;
        }
        node.next = deleteNode(position - 1, node.next);
        return node;
    }

    public int getLength(Node node) {
        if(node == null){
            return 0;}
        
        return 1 + getLength(node.next);
    }

    public Node rotateCounterClockwise(int k, Node node) {
        int rotate = k % (getLength(node));
        
        if (rotate == 0) {
            return node;
        } else {
            return counterClockwise(rotate, node);
        }
    }

    private Node counterClockwise(int rotate, Node node) {
        if (rotate == 0) {
            return node;
        }
        int temp = node.i;
        node = node.next;
        node = insert(temp, node);
        return counterClockwise(rotate-1, node);
    }

    public Node rotateClockwise(int i, Node node) {
       int rotate = i % (getLength(node));
        
        if (rotate == 0) {
            return node;
        } else {
            return clockwise(rotate, node);
        }
    }

    private Node clockwise(int rotate, Node node) {
        int i = 1;
        Node temp = node;
        while (i < getLength(node) - rotate) {
            temp = temp.next;
            i++;

        }
        i = 1;
        Node a = temp.next;
        Node b = a;
        temp.next = null;
        while (a.next != null) {
            a = a.next;
        }
        a.next = node;
        return b;
    }
    
}

/**
 * A02_Linked_Basic_2
 */
public class Linked_Basic_02{
    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        Node root = null;
        root = list.insert(12, root);
        root = list.insert(99, root);
        root = list.insert(37, root);
        root = list.insert(8, root);
        root = list.insert(18, root);

        // root = list.deleteLast(root);
        // root = list.deleteFirst(root);
        //   list.printing(root);
        // root = list.deleteNode(position, root);
        // int len = list.getLength(root);
        list.printing(root);
        root = list.rotateCounterClockwise(7, root);
        list.printing(root);
        root = list.rotateClockwise(7, root);
         list.printing(root);
    }
    
}