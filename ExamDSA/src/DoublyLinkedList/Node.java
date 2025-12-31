package DoublyLinkedList;

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
class DoublyLinkedList implements DoublyLinkedListMethods{
    int capacity;
    int size;
    Node head;

    public DoublyLinkedList(int capacity) {
        this.capacity = capacity;
        this.size = -1;
        this.head = null;
    }

    @Override
    public void addAtFront(int element) {
        // first make a new node to add
        Node newNode = new Node(element);
        if (isEmpty()){
            head = newNode;
            size++;
            return;
        }
        // store current head into temp
        Node temp = head;
        // assign newNode as a new head
        head = newNode;
        // assign previous head to the next of head
        head.next = temp;
        size++;
    }

    @Override
    public void addAtEnd(int element) {
        // new node is made
        Node newNode = new Node(element);
        if (isEmpty()){
            head = newNode;
            size++;
            return;
        }
        // start a node at head
        Node node = head;
        // go to the last node
        while (node.next != null){
            node = node.next;
        }
        // add new node to next of last element
        node.next = newNode;
    }

    @Override
    public void addAtPosition(int element, int pos) {
        // make a new Node
        Node newNode = new Node(element);
        if (isEmpty()){
            head = newNode;
            size++;
            return;
        }
        // start a node at head
        Node node =  head;
        for (int i = 0; i < pos-2; i++){
            node = node.next;
        }
        // store current node's next in temp
        Node temp = node.next;

        // assign new node to the next
        node.next = newNode;

        // assign previous element to the new node next
        newNode.next = temp;
    }

    @Override
    public int deleteAtFront() {
        // store the next of head in temp
        Node temp1 = head;
        Node temp = head.next;
        // assign head as a null
        head = null;
        // assign a new head
        head = temp;

        return temp1.data;
    }

    @Override
    public int deleteAtEnd() {
        // start with the head
        Node node = head;

        // get to the second last
        while (node.next.next != null){
            node = node.next;
        }
        Node temp = node.next;
        node.next = null;

        return temp.data;
    }

    @Override
    public boolean isEmpty() {
        if (size == -1){
            return true;
        }
        return false;
    }

    @Override
    public void display() {
        Node node  = head;
        while (node != null){
            System.out.print("->"+node.data);
            node = node.next;
        }
    }
}
