package LinkedListPractice;

public class main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtFront(11);
        linkedList.insertAtFront(12);
        linkedList.insertAtFront(14);
        linkedList.insertAtLast(13);
        linkedList.deleteAtFront();
        linkedList.deleteAtLast();
        linkedList.insertAtFront(13);
        linkedList.insertAtLast(14);
        linkedList.insertAtPos(16, 3);
        linkedList.deleteAtPos(2);
        linkedList.printList();
    }
}
