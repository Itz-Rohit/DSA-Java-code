import java.util.*;
public class lcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = scanner.nextInt();
        System.out .print("Enter b:");
        int b = scanner.nextInt();
        so sol = new so();
        int resul = sol.lowest(a,b);
        System.out.println("The lcm of two given number " + a +" , " + b +" is :"+resul);
    }
}
//class so{
//    public int lowest(int a , int b){
//        int re = Math.max(a,b);
//        while(true){
//            if(re%a==0 && re%b==0)
//                return re;
//
//            re++;
//        }
//
//    }
//}
class so{
    public int gcd(int a , int b){
        while(a!=b){
            if(a>b){
                a= a-b;
            }
            else{
                b=b-a;
            }
        }
        return b;

    }
    public int lowest(int a , int b){
        return (a * b)/gcd(a,b);
    }
}
