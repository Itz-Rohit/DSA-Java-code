package stack;

import java.util.Stack;

public class previos_greater_element  {
    void printgreater(int arr[] ,int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        System.out.println("Greater of 0:"+-1);
        for (int i=1;i<n;i++){
            while (stack.isEmpty()==false && stack.peek()<=arr[i]){
                stack.pop();
            }
            int pg = stack.isEmpty()?-1: stack.peek();
            System.out.println("greater of "+i+":"+pg);
            stack.push(i);
        }
    }
    public static void main(String[] args) {
        previos_greater_element obj = new previos_greater_element();
        int[] arr = {10, 4, 2, 20, 40, 12, 30};
        int n = arr.length;

        obj.printgreater(arr, n);
    }


}
