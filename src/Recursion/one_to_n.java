package Recursion;




class recc{
    public void recursion(int n){
        if (n==0){
            return ;

        }

        recursion(n-1);
        System.out.println(n);


    }

}
public class one_to_n {
    public static void main(String[] args) {
        recc  obj = new recc();
        obj.recursion(10);


    }
}
