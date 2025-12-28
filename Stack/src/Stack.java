public class Stack implements StackMethods{
    private int[]arr;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.arr = new int[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    @Override
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[++top] = value;
        }
    }
    @Override
    public void printStack() {
        if (isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("------------");
            for (int i = top; i >= 0; i--){
                System.out.println(arr[i]);
                System.out.println("------------");
            }
        }
    }

    @Override
    public int pop() {
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        int element = arr[top];
        arr[top--] = 0;
        return element;
    }

    @Override
    public int peek() {
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    @Override
    public boolean isEmpty() {
        if (top == -1){
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (top == capacity-1)
            return true;
        return false;
    }

    @Override
    public boolean checkPair(char open, char close) {
        return (open == '(' && close == ')' || open == '[' && close == ']' || open == '{' && close == '}');
    }

    @Override
    public boolean checkBalanced(String expr) {
        int n = expr.length();
        char[] stack = new char[n];
        int top1 = -1;

        for(int i = 0; i<n; i++){
            char c = expr.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                stack[++top1] = c;
            }else {
                if (top1 == -1){
                    System.out.println("Stack is empty give the valid expression");
                    return false;
                }
                else if(checkPair(stack[top1], c)){
                    stack[top1] = 0;
                    top1--;
                }
            }
        }
        // check if the stack is empty or not
        // if yes then it is true
        return top1 == -1;
    }
}
