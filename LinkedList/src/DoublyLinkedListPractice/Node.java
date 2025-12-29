package DoublyLinkedListPractice;

public class Node {
    int data;
    Node previous;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class DoublyLinekdList implements DoublyLinkedListMethods{
    int capacity;
    int top;
    Node head;
    Node tail;
    public DoublyLinekdList(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.head = null;
        this.tail = null;
    }

    @Override
    public void insertAtFront(int element) {
        if (isFull()){
            System.out.println("list is full");
            return;
        }
        if (isEmpty()){
            head = new Node(element);
            top++;
            return;
        }
        Node newNode = new Node(element);
        Node node = head;
        head = newNode;
        head.next = node;
        node.previous = head;
        top++;
    }

    @Override
    public void printList() {
        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node node = head;
        while (node != null){
            System.out.print("->"+node.data);
            node = node.next;
        }
    }

    @Override
    public void insertAtEnd(int element) {
        if (isFull()){
            System.out.println("list is full");
            return;
        }
        if (isEmpty()){
            head = new Node(element);
            top++;
            return;
        }
        Node node = head;
        while (node.next != null){
            node = node.next;
        }
        Node node1 = new Node(element);
        node.next = node1;
        node1.previous = node;
        top++;
    }

    @Override
    public void deleteFromFirst() {
        Node temp = head.next;
        temp.previous = null;
        head = temp;
        top--;
    }

    @Override
    public void deleteFromLast() {
        Node node = head;
        if (node.next == null){
            head = null;
            top--;
        }
        else {
            while (node.next.next != null) {
                node = node.next;
            }
            node.next = null;
            top--;
        }
    }

    @Override
    public boolean isEmpty() {
        if(top == -1){
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (top == capacity-1){
            return true;
        }
        return false;
    }

    @Override
    public void reverse() {
        if (isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node node = head;
        while (node.next != null){
            node = node.next;
        }
        System.out.println();// loop will get the pointer to the last element
        while (node != null){
            System.out.print("->"+node.data);
            node = node.previous;
        }
    }
}
