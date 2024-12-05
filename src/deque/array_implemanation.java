package deque;

public class array_implemanation {

    int[] arr;
    int front,cap,size;
    array_implemanation(int c){
        cap = c;
        arr = new int[cap];
        size =0;

        front = 0;
    }
    boolean isEmpty(){
        return(size==0);

    }
    boolean isfull(){
        return (cap==size);
    }
    int getrear(){
        if (isEmpty()){
            return -1;
        }
        else{
            return (front + size - 1) % cap;
        }

    }
    int getfront(){
        if (isEmpty()){
            return -1;
        }
        else {
            return front;
        }
    }
    void insertfront(int x){
        if (isfull()){
            return;
        }
        front=(front + cap -1) % cap;
        arr[front] =x;
        size++;


    }
    void insertrear(int x){
        if (isfull()){
            return;
        }
        int newrear = (front + size) % cap;
        arr[newrear] = x;
        size++;

    }
    void delete_front(){
        if (isEmpty()){
            return;
        }
        front = (front + 1)  % cap;
        size--;

    }
    void deleterear(){
        if (isEmpty()){
            return;
        }
        size--;
    }

        public static void main(String[] args) {

            array_implemanation deque = new array_implemanation(5);


            deque.insertrear(10);
            deque.insertrear(20);
            deque.insertrear(30);
            deque.insertrear(40);


            System.out.println("Front element: " + deque.getfront());
            System.out.println("Rear element: " + deque.getfront());


            deque.insertfront(5);


            System.out.println("Front element after insertFront: " + deque.getfront());
            System.out.println("Rear element after insertFront: " + deque.getrear());


            deque.delete_front();
            System.out.println("Front element after deleteFront: " + deque.getfront());


            deque.deleterear();
            System.out.println("Rear element after deleteRear: " + deque.getrear());


            deque.insertrear(50);


            System.out.println("Front element: " + deque.getfront());
            System.out.println("Rear element: " + deque.getrear());
        }
    }




