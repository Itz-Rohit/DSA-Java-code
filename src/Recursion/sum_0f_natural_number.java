package Recursion;


class sum{
    int get_sum(int n){
        if (n==0){
            return 0;
        }
        return n + get_sum(n-1);
    }
}

public class sum_0f_natural_number {
    public static void main(String[] args) {
        sum obj = new sum();
        int result = obj.get_sum(5);
        System.out.println("The output of the given number is :"+result);
    }
}
