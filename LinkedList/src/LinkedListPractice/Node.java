package LinkedListPractice;

public class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList implements LinkedMethods{
    Node head;

    public LinkedList() {
        this.head = null;
    }

    @Override
    public void insertAtFront(int element) {
        // create a new node
        Node newNode = new Node(element);

        // to the newNode next add head value
        newNode.next = head;

        // replace head with new node
        head = newNode;
    }

    @Override
    public void insertAtLast(int element) {
        Node node = head;
        while (node.next != null){
            node = node.next;
        }
        node.next = new Node(element);
    }

    @Override
    public void deleteAtFront() {
        Node temp = head.next;
        head = temp;
    }

    @Override
    public void deleteAtLast() {
        Node node = head;
        while (node.next.next != null){
            node = node.next;
        }
        node.next = null;
    }

    @Override
    public void printList() {
        while (head != null){
            System.out.print("->"+head.data);
            head = head.next;
        }
    }

    @Override
    public void insertAtPos(int element, int pos) {
        Node node = head;
        for (int i = 1; i<pos-1; i++){
            node = node.next;
        }
        Node temp = node.next;
        node.next = new Node(element);
        node.next.next = temp;
    }

    @Override
    public void deleteAtPos(int pos) {
        Node node = head;
        for(int i = 1; i<pos-1; i++){
            node = node.next;
        }
        Node temp = node.next.next;
        node.next = temp;
    }
}
