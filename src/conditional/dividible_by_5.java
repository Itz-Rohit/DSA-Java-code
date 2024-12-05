//take positive integer input and tell if it is divisible by 5 and 3

package conditional;
import java.util.*;

public class dividible_by_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if (n%5==0 && n%3==0){
            System.out.println(n);
            System.out.println("The given number is divisible by 5 and 3");
        }
        else{
            System.out.println(n);
            System.out.println("The given number is not dividible by 5 and 3");
        }
    }
}
