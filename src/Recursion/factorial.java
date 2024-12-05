package Recursion;


class fact{
    public int zepto(int n,int k){
        if (n==0 || n==1){
            return k;
        }
        return zepto(n-1,k*n);
    }
}

public class factorial {
    public static void main(String[] args) {
        fact obj = new fact();

        int result = obj.zepto(3,2);
        System.out.println("The output is :"+result);
    }
}
