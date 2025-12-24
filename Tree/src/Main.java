//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // create a root node
        Node node = new Node(11);

        BinaryTreeMethodsImpl impl = new BinaryTreeMethodsImpl();

        impl.addNode(node, new Node(1), new Node(12));
    }
}