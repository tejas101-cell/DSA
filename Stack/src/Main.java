//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(8);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(18);
        stack.push(19);
        stack.push(20);
        stack.push(21);
        stack.push(22);

        System.out.println("Is empty : "+stack.isEmpty()+"\nIs full : "+stack.isFull()+"\nPeek : "+stack.peek());

        stack.printStack();

        String expr = "(()){}(){{}}";
        if (stack.checkBalanced(expr)){
            System.out.println("Expression is balanced");
        }else
            System.out.println("Expression is not balanced");
    }
}