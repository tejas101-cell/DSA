package Deque;

public class main {
    public static void main(String[] args) {
        Deque deque = new Deque(5);
        deque.insertRear(10);
        deque.insertRear(12);
        deque.insertFront(13);
        deque.printDeque();
    }
}
