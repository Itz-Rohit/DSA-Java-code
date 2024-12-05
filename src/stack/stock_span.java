package stack;


import java.util.Stack;

public class stock_span {
    public static void stockspan(int arr[], int n) {
        Stack<Integer> s = new Stack<>();
//        int[] span =new int[n];
        s.push(0);
        int span =1;
        System.out.println("span of 0:"+span);
        for (int i=1;i<n;i++){
            while (s.isEmpty()==false && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            span= s.isEmpty()?i+1:i-s.peek();
            System.out.println("span of "+i+":"+span);
            s.push(i);
        }
    }

    public static void main(String[] args) {
        stock_span obj =new stock_span();
        int [] prices= {60, 10, 20, 15, 35, 50};
        int n = prices.length;
        obj.stockspan(prices,n);


    }

}
