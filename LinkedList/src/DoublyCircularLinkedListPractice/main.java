package DoublyCircularLinkedListPractice;

import DoublyLinkedListPractice.DoublyLinkedListMethods;

public class main {
    public static void main(String[] args) {
        DoublyCircularLinkedList dc = new DoublyCircularLinkedList(5);
        dc.insertAtFront(11);
        dc.insertAtFront(12);
        dc.printList();
    }
}
