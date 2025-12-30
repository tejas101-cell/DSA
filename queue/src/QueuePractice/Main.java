package QueuePractice;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insertFront(11);
        queue.insertFront(12);
        queue.insertRear(13);
        queue.insertRear(14);
        queue.deleteFront();
        queue.deleteRear();

        queue.printQueue();
    }
}
