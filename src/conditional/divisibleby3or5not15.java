//wap to find if a number is divisible by  3 or 5 but not didvisible by 15.

package conditional;
import java.util.*;

public class divisibleby3or5not15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int a=sc.nextInt();
        if (a%3==0 || a%5==0){
            if (a%15!=0){
                System.out.println("divisible");

            }
            else {
                System.out.println("not divisible by 15");
            }
        }
        else {
            System.out.println("not divisible");
        }
    }
}
//if(n%15!=0 && (n%3==0 || n%5==0))     based on precedence
