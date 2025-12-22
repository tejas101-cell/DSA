package DoublyLinkedList;

public interface DoublyLinkedListMethods {
    public Node addData(Node prevNode, Node currentNode, Node nextNode);
    public void printList(Node HeadNode);
    public Node insertAtFirst(Node HeadNode, int value);
    public Node inserAtEnd(Node headNode, int value);
    public Node insertAtPos(Node headNode, int value, int pos);
    public Node deleteAtEnd(Node headNode);
    public Node deleteFromPos(Node headNode, int pos);
}
