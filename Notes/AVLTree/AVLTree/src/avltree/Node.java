package avltree;

public class Node {
	
	    int key;        // value stored
	    int height;     // height of node (stored for efficiency)
	    Node left, right;

	    Node(int key) {
	        this.key = key;
	        this.height = 1;  // leaf node height = 1
	    }
	}

