package Recursion;




class rec{
    public void recursion(int n, int k){ //by adding int k and calling the recursion  function k+1 this convert forn non tail recursive to tail recursive
        //start:    Tail call elimination
        if (n==0){
            return ;

        }


        System.out.println(n);
        recursion(n-1,k+1); // n = n-1
    }                       // go to start

}
public class n_to_1 {
    public static void main(String[] args) {
        rec obj = new rec();
        obj.recursion(10,5);


    }
}
