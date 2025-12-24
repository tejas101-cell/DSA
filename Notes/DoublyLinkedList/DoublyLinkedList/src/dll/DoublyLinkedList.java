package dll;

public class DoublyLinkedList {

	    private Node head;   // Points to the first node of the list
	    private Node tail;   // Points to the last node of the list
	    private int size;    // Stores number of nodes in the list

	    // Insert a new node at the beginning of the list
	    public void insertFirst(int data) {

	        // Create a new node with given data
	        Node newNode = new Node(data);

	        // Check if the list is empty
	        if (head == null) {

	         // If empty, head and tail both point to newNode
	            head = tail = newNode;

	        } else {

	            // Link newNode with current head
	            newNode.next = head;   // newNode → current head
	            head.prev = newNode;   // current head ← newNode

	            // Update head to newNode
	            head = newNode;
	        }

	        // Increase the size of the list
	        size++;
	    }

	    // Insert a new node at the end of the list
	    public void insertLast(int data) {

	        // Create a new node
	        Node newNode = new Node(data);

	        // Check if list is empty
	        if (tail == null) {

	        // If empty, head and tail both point to newNode
	            head = tail = newNode;

	        } else {

	            // Link newNode after current tail
	            tail.next = newNode;   // current tail → newNode
	            newNode.prev = tail;   // newNode ← current tail

	            // Update tail to newNode
	            tail = newNode;
	        }

	        // Increase list size
	        size++;
	    }

	    // Delete the first node of the list
	    public void deleteFirst() {

	        // Check if list is empty
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        // Check if the list has only one node
	        if (head == tail) {

	            // Make list empty
	            head = tail = null;

	        } else {

	            // Move head to the next node
	            head = head.next;

	            // Remove backward link from new head
	            head.prev = null;
	        }

	        // Decrease list size
	        size--;
	    }

	    // Delete the last node of the list
	    public void deleteLast() {

	        // Check if list is empty
	        if (tail == null) {
	            System.out.println("List is empty");
	            return;
	        }

	        // Check if only one node exists
	        if (head == tail) {

	            // Make list empty
	            head = tail = null;

	        } else {

	            // Move tail to the previous node
	            tail = tail.prev;

	            // Remove forward link from new tail
	            tail.next = null;
	        }

	        // Decrease list size
	        size--;
	    }

	    // Display elements from head to tail
	    public void displayForward() {

	        // Start traversal from head
	        Node temp = head;

	        System.out.print("Forward: ");

	        // Traverse until end of list
	        while (temp != null) {
	            System.out.print(temp.data + " ⇄ ");
	            temp = temp.next;   // Move to next node
	        }

	        System.out.println("NULL");
	    }

	    // Display elements from tail to head
	    public void displayBackward() {

	        // Start traversal from tail
	        Node temp = tail;

	        System.out.print("Backward: ");

	        // Traverse until start of list
	        while (temp != null) {
	            System.out.print(temp.data + " ⇄ ");
	            temp = temp.prev;   // Move to previous node
	        }

	        System.out.println("NULL");
	    }

	    // Returns the number of nodes in the list
	    public int size() {
	        return size;   // O(1) time
	    }

	    // Main method to test the doubly linked list
	    public static void main(String[] args) {

	        // Create a DoublyLinkedList object
	        DoublyLinkedList dll = new DoublyLinkedList();

	        // Insert elements at beginning
	        dll.insertFirst(20);
	        dll.insertFirst(10);
	        
	        dll.displayForward();
	        dll.displayBackward();

	        // Insert elements at end
	        dll.insertLast(30);
	        dll.insertLast(40);

	        // Display list in both directions
	        dll.displayForward();
	        dll.displayBackward();

	        // Delete first and last elements
	        dll.deleteFirst();
	        dll.deleteLast();

	        // Display updated list
	        dll.displayForward();

	        // Display size of the list
	        System.out.println("Size: " + dll.size());
	    }
	}

