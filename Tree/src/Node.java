import java.util.List;

public class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }


}
class BinaryTreeMethodsImpl implements BinaryTreeMethods{
    @Override
    public Node addNode(Node parent, Node rightChild, Node leftChild) {
        if(parent.data < rightChild.data){
            parent.right = rightChild;
        }
        parent.left = leftChild;

        return parent;
    }

    @Override
    public void displayTree() {

    }
}
