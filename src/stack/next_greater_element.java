package stack;

import java.util.Stack;

public class next_greater_element {
    void next_greater(int arr[] ,int n){
        Stack<Integer>s = new Stack<>();
        s.push(arr[n-1]);
        System.out.println("first greater element is "+-1);
        for (int i=n-2;i<n;i--){
            while (s.isEmpty()==false && s.peek() <=arr[i])  
                s.pop();
            int nextgreater = s.isEmpty()?-1:s.peek();
            System.out.println(nextgreater+" ");
            s.push(arr[i]);

        }

    }

    public static void main(String[] args) {
        next_greater_element obj = new next_greater_element();
        int arr[] = {5,15,10,8,6,12,9,18};
        int n = arr.length;
        obj.next_greater(arr,n);

    }
}
