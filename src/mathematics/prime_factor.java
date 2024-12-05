package mathematics;

import java.util.*;
public class prime_factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = scanner.nextInt();
        soln2 soll = new soln2();

        System.out.println("The factor of given number " + a +" is : ");
        soll.prime__factor(a);
    }
}
class soln2 {
    boolean isprime(int a) {
        if (a == 1) {
            return false;
        }
        if (a == 2 || a == 3) {
            return true;
        }
        if (a % 2 == 0 || a % 3 == 0) {
            return false;
        }
        for (int i = 2; i * i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }


    //    public void prime__factor(int a) {
//        for (int i = 2; i < a; i++) {
//            if (isprime(i)) {
//                int x =  i;
//                while (a % x == 0) {
//                    System.out.print(i);
//                    x =x*i;
//
//                }
//
//            }
//        }
//    }
//}
    public void prime__factor(int a) {
        for (int i = 2; i * i < a; i++) {
            if (isprime(i)) {

                while (a % i == 0) {
                    System.out.print(i);
                    a = a / i;

                }

            }
        }
        if(a>1){
            System.out.print(a);
        }

    }

}


