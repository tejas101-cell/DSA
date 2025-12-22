public interface LinkedListMethods {
    public Node addnode(Node parent, Node child);
    public void printLinkedList(Node rootNode);
    public Node insertAtFront(Node node, int x);
    public void insertAtEnd(Node HeadNode, int x);
    public void insertAtPos(Node HeadNode, int pos, int x);
    public void deleteFromPos(Node HeadNode, int pos);
    public Node deleteFromTheStart(Node HeadNode);
    public Node deleteFromTheLast(Node HeadNode);
    public void searchElement(Node HeadNode, int element);
    public void modifyElementAtPos(Node HeadNode, int pos, int element);
    public void reverseList(Node HeadNode);
}
