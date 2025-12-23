//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(16);
        System.out.println(queue.size);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println("Front: "+queue.getFront());
        System.out.println("Rear: "+queue.getRear());
        System.out.println("Is queue full: "+queue.isFull());
        queue.printQueue();
    }
}