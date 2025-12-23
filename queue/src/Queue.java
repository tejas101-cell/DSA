public class Queue implements QueueMethods{
    int[] arr;
    int capacity;
    int size;

    public Queue(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    @Override
    public void enqueue(int x) {
        if (size == capacity){
            System.out.println("Queue overflowing");
            return;
        }
        arr[size++] = x;
    }

    @Override
    public void printQueue() {
        int i = 0;
        while (i < capacity){
            System.out.println(arr[i]);
            i++;
        }
    }

    @Override
    public void dequeue() {
        if(size == 0){
            System.out.println("Queue underflowing");
        }
        for (int i = 1; i<size; i++){
            arr[i-1] = arr[i];
        }
        size--;
        arr[size] = 0;
    }

    @Override
    public int getFront() {
        return arr[0];
    }

    @Override
    public int getRear() {
        return arr[size-1];
    }

    @Override
    public boolean isFull() {
        if (size == capacity){
            return true;
        }
        return false;
    }


}
