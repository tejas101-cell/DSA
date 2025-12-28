public interface StackMethods {
    public void push(int value);
    public void printStack();
    public int pop();
    public int peek();
    public boolean isEmpty();
    public boolean isFull();
    public boolean checkPair(char open, char close);
    public boolean checkBalanced(String expr);
}
