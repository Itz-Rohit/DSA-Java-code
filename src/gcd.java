import java .util.*;
public class gcd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a:");
        int a =scanner.nextInt();
        System.out.print("Enter b: ");

        int b = scanner.nextInt();
        scanner.close();
        Soln solution = new Soln();
        int result = solution.hcm(a,b);
        System.out.println("The gcd of given number  "+ a +" , " + b +" is;"+result);

    }
}
//class Soln{
//    public int hcm(int a, int b) {
//        int res = Math.min(a, b);
//        while (res > 0) {
//            if (a % res == 0 && b % res == 0) {
//                break;
//            }
//            res--;
//
//        }
//        return res;
//    }
//}
class Soln{
    public int hcm(int a, int b){
        while(a!=b){
            if(a>b){
                a = a-b;
            }
            else{
                b = b-a;
            }

        }
        return b;
    }
}




