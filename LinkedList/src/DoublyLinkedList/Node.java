package DoublyLinkedList;

public class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLinkedListMethodsImpl implements DoublyLinkedListMethods{

    @Override
    public Node addData(Node prevNode, Node currentNode, Node nextNode) {

        currentNode.next = nextNode;
        currentNode.prev = prevNode;

        return nextNode;
    }

    @Override
    public void printList(Node HeadNode) {
        while (HeadNode != null){
            System.out.print("->"+HeadNode.data);
            HeadNode = HeadNode.next;
        }
    }

    @Override
    public Node insertAtFirst(Node HeadNode, int value) {
        // making new node and adding it into the prev of headnode
        Node node = new Node(value);
        HeadNode.prev = node;

        // setting up node
        node.next = HeadNode;
        node.prev = null;

        return node;
    }

    @Override
    public Node inserAtEnd(Node headNode, int value) {
        Node temp = headNode;
        while (temp.next != null){
            temp = temp.next;
        }
        // making a new node to add into the list at the end
        Node node = new Node(value);
        temp.next = node;

        // setting up node
        node.prev = temp;
        node.next = null;

        return headNode;
    }

    @Override
    public Node insertAtPos(Node headNode, int value, int pos) {
        Node temp = headNode;
        for (int i = 1; i<pos && temp.next != null; i++){
            temp = temp.next;
        }
        // a -> __ -> b;
        // creating the new node
        Node node = new Node(value);
        Node temp1 = temp.prev;
        temp.prev = node;

        // setting up the new node
        node.next = temp;
        node.prev = temp1;
        // adding node to the next of a
        temp1.next = node;

        return headNode;
    }

    @Override
    public Node deleteAtEnd(Node headNode) {
        Node temp = headNode;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;

        return headNode;
    }

    @Override
    public Node deleteFromPos(Node headNode, int pos) {
        Node temp = headNode;

        for (int i = 0; i<pos-1 && temp.next != null; i++){
            temp = temp.next;
        }
        Node prevTemp = temp.prev;
        Node nextTemp = temp.next;

        temp.next = null;
        temp.prev = null;

        prevTemp.next = nextTemp;
        nextTemp.prev = prevTemp;

        return headNode;
    }


}