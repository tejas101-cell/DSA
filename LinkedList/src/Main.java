//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // parent
        Node node = new Node(11);
        LinkedListMethodImpl impl = new LinkedListMethodImpl();

        Node node1 = impl.addnode(node, new Node(12));
        Node node2 = impl.addnode(node1, new Node(13));
        Node node3 = impl.addnode(node2, new Node(14));

        System.out.println(node3.next);

        // passing rootnode of perticular linkedList
        impl.printLinkedList(node);
        System.out.println();
        System.out.println("****************************************\nafter adding");
        // two arguments giving head node/ root node and data for the node to be added
        // retrning a node which can be used to print the new list
        Node node4 = impl.insertAtFront(node, 16);

        impl.printLinkedList(node4);

        impl.insertAtEnd(node, 17);

        System.out.println();
        System.out.println("***************************************\nafter adding at end");

        impl.printLinkedList(node4);

        // index starting from the 1
        impl.insertAtPos(node4, 3, 10);
        System.out.println();
        System.out.println("***************************************\nafter adding at respective position");

        impl.printLinkedList(node4);

        // node4 has became the new root
        impl.deleteFromPos(node4, 3);
        System.out.println();
        System.out.println("***************************************\nafter deleting from respective position");

        impl.printLinkedList(node4);

        node4 = impl.deleteFromTheStart(node4);
        System.out.println();
        System.out.println("***************************************\nafter deleting from the start");

        impl.printLinkedList(node4);

        node4 = impl.deleteFromTheLast(node4);
        System.out.println();
        System.out.println("***************************************\nafter deleting from the start");

        impl.printLinkedList(node4);

        System.out.println();
        System.out.println("***************************************");

        impl.searchElement(node4, 1);

        impl.modifyElementAtPos(node4, 2, 21);
        System.out.println();
        System.out.println("***************************************\nupdating the linkedList");

        impl.printLinkedList(node4);
    }
}