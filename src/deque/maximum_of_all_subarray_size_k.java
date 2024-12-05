package deque;

import java.util.Deque;
import java.util.LinkedList;

public class maximum_of_all_subarray_size_k {
    void printMax(int[] arr, int k) {
        int n = arr.length;
        Deque<Integer> dq = new LinkedList<Integer>();
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();

            dq.addLast(i);
        }
        for (int i=k;i<n;i++){
            System.out.println(arr[dq.peek()]+" ");
            while (!dq.isEmpty() && dq.peek()<i-k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[i]>= arr[dq.peekLast()]){
                dq.removeLast();






            }
            dq.addLast(i);
        }
        System.out.println(arr[dq.peek()]+" ");


    }

    public static void main(String[] args) {
        maximum_of_all_subarray_size_k obj = new maximum_of_all_subarray_size_k();
        int[] arr = {12, 1, 78, 90, 57, 89, 56};
        int k = 3;
        obj.printMax(arr, k);
    }
}
