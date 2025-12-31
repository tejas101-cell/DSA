package CircularQueueuPractice;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class CircularQueue implements QueueMethods{
    int capacity;
    int size;
    Node front;
    Node rear;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.size = -1;
        this.front = null;
        this.rear = null;
    }

    @Override
    public void insertFront(int element) {
        Node newNode = new Node(element);
        if (size == -1){
            front = newNode;
            rear = newNode;
            rear.next = front;
            size++;
            return;
        }
        Node node = front;
        while (node.next != front){
            node = node.next;
        }
        // store current front somewhere
        Node temp = front;

        front = newNode;
        front.next = temp;
        rear = node;
        rear.next = front;
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
        Node temp = front;
        while (temp.next != front){
            temp = temp.next;
        }
        temp.next = newNode;
        rear = newNode;
        rear.next = front;
        size++;
    }

    @Override
    public void deleteFront() {

    }

    @Override
    public void printQueue() {
        if (size == -1){
            System.out.println("Queue is null");
            return;
        }
        Node node = front;
        do {
            System.out.print("->"+node.data);
            node = node.next;
        }while (node != front);
    }
}
