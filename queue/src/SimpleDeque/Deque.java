package SimpleDeque;

public class Deque implements DequeMethods{
    int[] arr;
    int rear, front, capacity;

    public Deque(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.rear = -1;
        this.front = -1;
    }
    @Override
    public boolean isFull() {
        if (front == 0 && rear == capacity-1){
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (front == -1 && rear == -1){
            return true;
        }
        return false;
    }

    @Override
    public void printDeque() {
        int i = 0;
        while (i < capacity){
            System.out.print("->"+arr[i]);
            i++;
        }
    }

    @Override
    public void deletFront() {
        arr[front] = 0;
        if(rear == front){
            rear = front = -1;
            return;
        }
        front++;
    }
    @Override
    public void deleteRear(){
        arr[rear] = 0;
        if (rear == front){
            rear = front = -1;
            return;
        }
        rear--;
    }

    @Override
    public void insertFront(int value) {
        if(isFull()){
            System.out.println("Deque is full");
            return;
        }
        if(isEmpty()){
            front = rear = 0;
            arr[front] = value;
        }
        else {
            if (front == -1){
                front++;
            }
            for (int i = rear; i>front-1; i--){
                arr[i+1] = arr[i];
            }

            arr[front] = value;
            rear++;
        }
    }

    @Override
    public void insertRear(int value) {
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = value;
    }
}
