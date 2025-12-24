package AMCT;

public class AlmostCompleteBinaryTree {

	    private int[] tree;   // array to store tree nodes
	    private int size;     // number of nodes in the tree

	    // Constructor
	    AlmostCompleteBinaryTree(int capacity) {
	        tree = new int[capacity];
	        size = 0;
	    }

	    // Insert node (level order)
	    public void insert(int data) {
	        if (size == tree.length) {
	            System.out.println("Tree is full");
	            return;
	        }
	        tree[size] = data;
	        size++;
	    }

	    // Formula methods
	    public int leftChild(int i) {
	        return 2 * i + 1;
	    }

	    public int rightChild(int i) {
	        return 2 * i + 2;
	    }

	    public int parent(int i) {
	        return (i - 1) / 2;
	    }

	    // Display parent, left child and right child safely
	    public void displayRelations() {
	        System.out.println("Index | Node | Left Child | Right Child");

	        for (int i = 0; i < size; i++) {

	            System.out.print(i + "     | " + tree[i] + "   | ");

	            int left = leftChild(i);
	            if (left < size) {
	                System.out.print(tree[left] + "        | ");
	            } else {
	                System.out.print("NULL       | ");
	            }

	            int right = rightChild(i);
	            if (right < size) {
	                System.out.print(tree[right]);
	            } else {
	                System.out.print("NULL");
	            }

	            System.out.println();
	        }
	    }
	}

