package dll;
public class Node {
	    int data;        // Stores the value of the node
	    Node prev;       // Reference to the previous node
	    Node next;       // Reference to the next node

	    // Constructor to create a new node
	    Node(int data) {
	        this.data = data;   // Initialize node data
	        this.prev = null;   // Previous pointer initially null
	        this.next = null;   // Next pointer initially null
	    }
	}

