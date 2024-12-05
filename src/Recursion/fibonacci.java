package Recursion;


class fibo{
    int fib(int n){
        if (n==0){
            return 0 ;
        }
        if (n==1){
            return 1;
        }
        return fib(n-1) + fib(n-2);

    }
}
public class fibonacci {
    public static void main(String[] args) {
        fibo obj =new fibo();
        int result = obj.fib(5);
        System.out.println("The result of the fibo is "+result);
    }
}
