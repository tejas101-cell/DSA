package AMCT;

	public class Main {
	    public static void main(String[] args) {

	    	AlmostCompleteBinaryTree tree =
	                new AlmostCompleteBinaryTree(10);

	        tree.insert(10);
	        tree.insert(20);
	        tree.insert(30);
	        tree.insert(40);
	        tree.insert(50);
	        tree.insert(60);

	        tree.displayRelations();
	    }
	}

