package SinglyCircularLinkedListPractice;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SinglyCircularLinkedList implements SinglyCircularLinkedListMethods{
    int capacity;
    int size;
    Node head;

    public SinglyCircularLinkedList(int capacity) {
        this.capacity = capacity;
        this.size = -1;
        this.head = null;
    }


    @Override
    public void insertAtFront(int element) {
        // if list is empty
        if (size == -1){
            head = new Node(element);
            head.next = head;
            size++;
            return;
        }
        // first go to the last node
        Node temp = head;
        while (temp.next != head){
            temp = temp.next;
        }
        // create new node to add
        Node newNode = new Node(element);

        // assign head to the newNode next
        newNode.next = head;

        // assign newNode to the last node next
        temp.next = newNode;

        // then assign newNode as a new Head
        head = newNode;
        size++;
    }

    @Override
    public void printList() {
        if(size == -1){
            System.out.println("List is empty");
            return;
        }
        Node node = head;
        do {
            System.out.print("->"+node.data);
            node = node.next;
        }while (node != head);
    }

    @Override
    public void deleteAtFront() {
        if (size == -1){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp.next != head){
            temp = temp.next;
        }
        head = head.next;
        temp.next = head;
        size--;
    }

    @Override
    public void insertAtLast(int element) {
        Node node = new Node(element);
        if (size == -1){
            head = node;
            node.next = head;
            size++;
            return;
        }
        // pointer to reach at the last element
        Node temp = head;
        while (temp.next != head){
            temp = temp.next;
        }
        temp.next = node;
        node.next = head;
        size++;
    }

    @Override
    public void deleteAtLast() {
        Node node = head;
        while(node.next.next != head){
            node = node.next;
        }
        node.next = head;
    }
}
