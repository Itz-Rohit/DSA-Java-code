package Queue;

import java.util.Queue;

public class queue_using_array {
    int front, size,cap;
    int[] arr;
    void Queue(int c){
        cap =c;
        size = 0;
        front = 0;
        arr = new int[cap];
    }
    boolean isFull(){
        return (cap ==size);
    }
    boolean isEmpty(){
        return (size==0);
    }
    int getrear(){
        if (isEmpty()){
            return -1;

        }
        else{
            return (front + size - 1) % cap;
        }
    }
    void enqueue(int x){
        if (isFull()) {
            return;
        }
            int rear = getrear();
            rear = (rear +1) % cap;
            arr[rear] = x;
            size ++;
        }
        void deque(){
        if (isEmpty()){
            return;
        }
        front = (front  -1) % cap;
        size--;

    }

    public static void main(String[] args) {
        queue_using_array  queue = new queue_using_array();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Queue full: " + queue.isFull());
        System.out.println("Queue empty: " + queue.isEmpty());
    }
}
