package SimpleDeque;

public class main {
    public static void main(String[] args) {
        Deque deque = new Deque(5);
        System.out.println(deque.isEmpty());
        deque.insertRear(10);
        deque.insertRear(11);
        deque.insertRear(11);
        deque.insertFront(13);
        deque.insertFront(14);
        deque.deletFront();
        deque.deleteRear();
        deque.deleteRear();
        deque.deleteRear();
        deque.deleteRear();
        deque.insertFront(12);
        deque.insertFront(12);
        deque.insertFront(12);
        deque.deleteRear();
        deque.deleteRear();
        deque.deleteRear();
        
        deque.printDeque();


    }
}
