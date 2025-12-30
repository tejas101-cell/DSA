package QueuePractice;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Queue implements QueueMethods{
    int capacity;
    int size;
    Node front;
    Node rear;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.size = -1;
        this.front = null;
        this.rear = null;
    }

    @Override
    public void insertFront(int element) {
        Node newNode = new Node(element);
        if (size == -1) {
            front = newNode;
            rear = newNode;
            size++;
            return;
        }
        // store current front into temp
        Node temp = front;
        // assign new node to front
        front = newNode;
        // assign old front to the next of new front
        front.next = temp;

        // starting from the front
        Node node = front;
        // go till the last
        while (node.next != null){
            node = node.next;
        }
        rear = node;
        size++;
    }

    @Override
    public void insertRear(int element) {
        Node newNode = new Node(element);
        if (size == -1){
            front = newNode;
            rear = newNode;
            size++;
            return;
        }
        Node temp = rear;
        temp.next = newNode;
        rear = newNode;
        size++;
    }

    @Override
    public void deleteFront() {
        Node temp = front.next;
        front = null;
        front = temp;
    }

    @Override
    public void deleteRear() {
        Node temp = front;
        while (temp.next != rear){
            temp = temp.next;
        }
        rear = null;
        rear = temp;
        rear.next = null;
    }

    @Override
    public void printQueue() {
        Node node = front;
        do {
            System.out.print("->"+node.data);
            node = node.next;
        }while (node != null);
    }
}
