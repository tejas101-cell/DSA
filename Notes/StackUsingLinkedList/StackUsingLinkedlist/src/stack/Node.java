package stack;

public class Node {
    int data;      // stores stack element
    Node next;     // points to next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}