package stack;

public class StackUsingLinkedList {
	
	    // Top of stack (head of linked list)
	    Node top = null;

	    /* =========================
	       PUSH OPERATION
	       (Insert at Front)
	       ========================= */
	    void push(int data) {

	        // Create new node
	        Node newNode = new Node(data);

	        // Link new node to current top
	        newNode.next = top;

	        // Move top to new node
	        top = newNode;

	        System.out.println(data + " pushed into stack");
	    }

	    /* =========================
	       POP OPERATION
	       (Delete at Front)
	       ========================= */
	    void pop() {

	        // Stack empty check
	        if (top == null) {
	            System.out.println("Stack Underflow");
	            return;
	        }

	        // Remove top node
	        System.out.println("Popped element: " + top.data);
	        top = top.next;
	    }

	    /* =========================
	       PEEK OPERATION
	       ========================= */
	    void peek() {

	        if (top == null) {
	            System.out.println("Stack is empty");
	            return;
	        }

	        System.out.println("Top element: " + top.data);
	    }

	    /* =========================
	       DISPLAY STACK
	       ========================= */
	    void display() {

	        if (top == null) {
	            System.out.println("Stack is empty");
	            return;
	        }

	        Node temp = top;
	        System.out.print("Stack: ");
	        while (temp != null) {
	            System.out.print(temp.data + " → ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }

	    /* =========================
	       MAIN METHOD
	       ========================= */
	    public static void main(String[] args) {

	        StackUsingLinkedList stack = new StackUsingLinkedList();

	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        stack.display();

	        stack.peek();

	        stack.pop();
	        stack.display();

	        stack.pop();
	        stack.pop();
	        stack.pop();   // underflow
	    }
	}

