package mathematics;

import java.util.*;
public class computing_power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  x :");
        int x = scanner.nextInt();
        System.out.print("Enter n :");
        int n = scanner.nextInt();
        soln5 solution = new soln5();
        System.out.print("The computing power of " +x  +"");
    }
}
class soln5{
    public int pow(int x , int n){
        int res = 1;
        for(int i=1;i<=n;i++){
            res = res * x;


        }
        return res;

    }
}
