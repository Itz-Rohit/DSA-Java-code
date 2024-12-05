
import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = scanner.nextInt();
        solution1 sol2 =  new solution1();
        boolean result1 = sol2.isprime(a);
        System .out.println("The given number " + a +" is :"+result1);
    }
}
//class solution1{
//    boolean  isprime(int a){
//        if(a==1){
//            return false;
//        }
//        for(int i =2;i<a;i++){
//            if(a % i == 0){
//                return false;
//            }
//
//
//        }
//        return true;
//
//    }
//}
//class solution1{
//    boolean  isprime(int a){
//        if(a==1){
//            return false;
//        }
//        for(int i =2;i*i<=a;i++){
//            if(a % i == 0){
//                return false;
//            }
//
//
//        }
//        return true;
//
//    }
//}
class solution1{
    boolean  isprime(int a){
        if(a==1){
            return false;

        }
        if(a == 2 || a ==3){
            return true;
        }
        if(a % 2 == 0 || a % 3 ==0){
            return false;
        }
        for(int i =2;i*i<a;i++){
            if(a % i == 0){
                return false;
            }


        }
        return true;

    }
}