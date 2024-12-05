package deque;

import java.util.Deque;
import java.util.LinkedList;

public class min_max {

    Deque<Integer> d = new LinkedList<Integer>();
    void InsertMin(int x) {
            d.offerFirst(x);

    }
    void InsertMax(int x){
        d.offerLast(x);

    }
    int getmin(){
        return(d.peekFirst());
    }
    int getmax(){
        return (d.peekLast());
    }
    int extractmin(){
        return (d.pollFirst());

    }
    int extractmax(){
        return (d.pollLast());
    }
    public static void main(String[] args) {
        min_max minMaxDeque = new min_max();


        minMaxDeque.InsertMin(10);
        minMaxDeque.InsertMax(20);
        minMaxDeque.InsertMin(5);
        minMaxDeque.InsertMax(25);


        System.out.println("Min element: " + minMaxDeque.getmin());
        System.out.println("Max element: " + minMaxDeque.getmax());


        System.out.println("Extracted Min element: " + minMaxDeque.extractmin());
        System.out.println("Extracted Max element: " + minMaxDeque.extractmax());


        System.out.println("Min element after extraction: " + minMaxDeque.getmin());
        System.out.println("Max element after extraction: " + minMaxDeque.getmax()); 
    }
}

