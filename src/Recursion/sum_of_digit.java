package Recursion;

class summation{
    public int summing(int n){
        if (n==0){
            return 0;
        }
        return summing(n/10) + n%10;
    }

}
public class sum_of_digit {
    public static void main(String[] args) {
        summation obj =new summation();
        int result = obj.summing(2345);
        System.out.println("The output is :" +result);

    }
}
