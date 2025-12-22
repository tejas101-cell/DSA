package DoublyLinkedList;

public class main {
    public static void main(String[] args) {
        // creating root node
        Node node = new Node(11);

        // instantiating the DoublyLinkedListMethods soo that we can implement the methods
        DoublyLinkedListMethodsImpl impl = new DoublyLinkedListMethodsImpl();
        Node node1 = impl.addData(null, node, new Node(12));
        Node node2 = impl.addData(node, node1, new Node(13));
        Node node3 = impl.addData(node1, node2, new Node(14));
        Node node4 = impl.addData(node2, node3, new Node(15));
        Node node5 = impl.addData(node3, node4, new Node(16));

        // giving the root node
        impl.printList(node);

        node = impl.insertAtFirst(node, 18);
        System.out.println();
        System.out.println("**************************************\nadding the element at the first");

        impl.printList(node);

        node = impl.inserAtEnd(node, 19);
        System.out.println();
        System.out.println("**************************************\nadding the element at the end");

        impl.printList(node);

        node = impl.insertAtPos(node, 20, 4);
        System.out.println();
        System.out.println("**************************************\nadding the element at the specific position");

        impl.printList(node);

        node = impl.deleteAtEnd(node);
        System.out.println();
        System.out.println("**************************************\ndeleting last element");

        impl.printList(node);

        node = impl.deleteFromPos(node, 4);
        System.out.println();
        System.out.println("**************************************\ndeleting from specific position");

        impl.printList(node);
    }
}
