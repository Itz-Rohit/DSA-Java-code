package Recursion;


class rope{
    public int maxpiece(int n ,int a,int b,int c){
        if (n==0){
            return 0;

        }
        if (n == -1) {

            return -1;
        }
        int temp1 = maxpiece(n-a,a,b,c);
        int temp2 = maxpiece(n-b,a,b,c);
        int temp3 = maxpiece(n-c,a,b,c);
        int pieces = Math.max(temp3,Math.max(temp1,temp2));



        if (pieces ==-1){
            return -1;

        }
        return pieces+1;
    }

}

public class rope_cutting {

    public static void main(String[] args) {
        rope obj = new rope();
        int result = obj.maxpiece(4,1,2,5);
        System.out.println("The maximum piece of length of rope is :"+result);
    }
}
