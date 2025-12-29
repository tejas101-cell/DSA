package DoublyCircularLinkedListPractice;

import DoublyLinkedListPractice.DoublyLinkedListMethods;

public class Node {
    int data;
    Node next;
    Node previous;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
class DoublyCircularLinkedList implements DoublyCircularLinkedListMethods {
    int capacity;
    int size;
    Node head;

    public DoublyCircularLinkedList(int capacity) {
        this.head = null;
        this.capacity = capacity;
        this.size = -1;
    }

    @Override
    public void insertAtFront(int element) {
        Node newNode = new Node(element);
        if (size == -1){
            head = newNode;
            head.next = head;
            head.previous = head;
            size++;
            return;
        }
        // start from the beginning
        Node node = head;
        while (node.next != head){
            node = node.next;
        }
        newNode.next = head;
        newNode.previous = node;

        node.next = newNode;
        head.previous = newNode;

        head = newNode;
        size++;
    }

    @Override
    public void printList() {
        if (size == -1){
            System.out.println("List is empty");
            return;
        }
        Node node = head;
        do {
            System.out.print("->"+node.data);
            node = node.next;
        }while (node != head);
    }
}