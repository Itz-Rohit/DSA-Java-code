package deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class deque_implementation {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<Integer>();
        d.addFirst(10);
        d.addLast(20);
        d.addFirst(30);
        d.addLast(40);
        Iterator it = d.iterator();
        while (it.hasNext()){
            System.out.println(it.next() + " ");
        }
        System.out.println();
        Iterator et = d.descendingIterator();
        while (et.hasNext()){
            System.out.println(et.next() + " ");
        }
        System.out.println("first element:" +d.getFirst());
        System.out.println("Last element:" +d.getLast());
        d.removeLast();
        d.removeFirst();
        System.out.println("mow last element" +d.getLast());
        System.out.println("now first element" +d.getFirst());
    }
}
