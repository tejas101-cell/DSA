package DoublyLinkedListPractice;

public class main {
    public static void main(String[] args) {
        DoublyLinekdList dl = new DoublyLinekdList(5);
        dl.insertAtFront(12);
        dl.insertAtFront(11);
        dl.insertAtFront(14);
        dl.insertAtEnd(13);
        dl.deleteFromFirst();
        dl.deleteFromLast();
        dl.deleteFromFirst();
        dl.deleteFromLast();
        dl.insertAtFront(11);
        dl.insertAtEnd(12);
        dl.insertAtFront(13);
        dl.insertAtFront(11);
        dl.insertAtEnd(12);
        dl.deleteFromLast();
        dl.printList();
        dl.reverse();
    }
}
