package exercise01;

public class A01_Linked_Basic_1 {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        A01_Linked_Basic_1 list = new A01_Linked_Basic_1();

        list.head = new Node(20);
        head.next = new Node(40);
    }
}
