package SinglyCircularLinkedListPractice;

public class main {
    public static void main(String[] args) {
        SinglyCircularLinkedList sc = new SinglyCircularLinkedList(5);
        sc.insertAtFront(11);
        sc.insertAtFront(12);
        sc.insertAtFront(13);
        sc.insertAtLast(16);

        sc.deleteAtLast();
        sc.deleteAtFront();
//        sc.deleteAtFront();

        sc.printList();
    }
}
