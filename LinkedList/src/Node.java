import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedListMethodImpl implements LinkedListMethods{


    @Override
    public Node addnode(Node parent, Node child) {
        if(parent == null){
            System.out.println("root node");
        }
        else {
            parent.next = child;
        }
        return child;
    }

    @Override
    public void printLinkedList(Node rootNode) {
        while (rootNode != null){
            System.out.print("->"+rootNode.data);
            rootNode = rootNode.next;
        }
    }

    @Override
    public Node insertAtFront(Node HeadNode, int x) {
        Node node = new Node(x);
        node.next = HeadNode;
        return node;
    }

    @Override
    public void insertAtEnd(Node HeadNode, int x) {

        while(HeadNode.next != null){
            HeadNode = HeadNode.next;
        }
        // headNode is at end now

        // create a new node to add at the end
        Node node = new Node(x);
        HeadNode.next = node;
    }
    // linkedList position starts from the 1
    @Override
    public void insertAtPos(Node HeadNode, int pos, int x) {
        for(int i = 1; i<pos-1 && HeadNode.next != null ;i++){
            HeadNode = HeadNode.next;
        }
        Node temp = HeadNode.next;
        // headnode will come at the desired position
        Node node = new Node(x);
        HeadNode.next = node;

        node.next = temp;
    }

    @Override
    public void deleteFromPos(Node HeadNode, int pos) {
        Node temp = HeadNode;
        for (int i = 1; i<pos-1 && HeadNode.next != null; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    @Override
    public Node deleteFromTheStart(Node HeadNode) {
        if(HeadNode == null){
            System.out.println("LinkedList is Empty");
        }
        HeadNode = HeadNode.next;
        return HeadNode;
    }

    @Override
    public Node deleteFromTheLast(Node HeadNode) {
        Node temp = HeadNode;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return HeadNode;
    }

    @Override
    public void searchElement(Node HeadNode, int element) {
        int i = 1;
        boolean flag = false;
        while(HeadNode.next != null){
            if(HeadNode.data == element){
                System.out.println("Element found at: "+i);
                flag = true;
            }

            HeadNode = HeadNode.next;
            i++;
        }
        if (flag == false){
            System.out.println("Element not found");
        }

    }

    @Override
    public void modifyElementAtPos(Node HeadNode, int pos, int element) {
        for(int i = 1; i<pos && HeadNode.next != null; i++){
            HeadNode = HeadNode.next;
        }
        HeadNode.data = element;
    }

    @Override
    public void reverseList(Node HeadNode) {
        
    }
}
