package Recursion;

class jos{
    public int jose(int n,int k){
        if (n==1){
            return 0;
        }
        return (jose(n-1,k)+k)%n;
    }
}

public class josephus_problem {
    public static void main(String[] args) {
        jos obj = new jos();
        int result = obj.jose(5,3);
        System.out.println("The last one live alvive is :"+result);
    }
}
