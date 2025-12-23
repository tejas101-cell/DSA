package Deque;

public class Deque implements DequeMethods {
    int[] arr;
    int front, size;
    int capacity;

    public Deque(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = 0;
        this.size = 0;
    }

    @Override
    public void insertRear(int value) {
        if(size == capacity){
            System.out.println("The deque is full");
        }
        else {
            int rear = (front + size)%capacity;
            arr[rear] = value;
            size++;
        }
    }

    @Override
    public void insertFront(int value) {
        if(size == capacity){
            System.out.println("Deque is full");
            return;
        }
        else {
            front = (front-1 + capacity)%capacity;
            arr[front] = value;
            size++;
        }
    }

    @Override
    public void printDeque() {
        int i = 0;
        while(i < capacity){
            System.out.print("->"+arr[i]);
            i++;
        }
    }

}
