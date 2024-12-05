import java.util.*;

public class divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = scanner.nextInt();
        soln3 sol = new soln3();

        System.out.print("The divisor of the given number "+a+" is ");
        sol.div(a);
    }
}
class soln3{

    public void   div(int a){
        for(int i =1;i<=a;i++)
            if(a%i==0)
                System.out.print(i);





    }



}
//class soln3{
//    public void div(int a){
//        for(int i = 1; i*i<=a;i++){
//            if(a%i == 0)
//                System.out.print(i);
//
//            if(a!=a/i){
//                System.out.print(a/i);
//            }
//
//        }
//    }
//}
