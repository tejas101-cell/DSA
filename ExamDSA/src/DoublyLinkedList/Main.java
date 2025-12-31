package DoublyLinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList(5);
        dl.addAtFront(11);
        dl.addAtFront(12);
        dl.addAtEnd(13);
        dl.addAtPosition(16,2);
        System.out.println("Deleted Element from end: "+dl.deleteAtFront());
        System.out.println("Deleted Element from last: "+dl.deleteAtEnd());
        dl.display();
    }
}