package CircularQueueuPractice;

public class Main {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.insertFront(11);
        cq.insertFront(12);
        cq.insertRear(13);
        cq.insertFront(12);
        cq.printQueue();
    }
}
