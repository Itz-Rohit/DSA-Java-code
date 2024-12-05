//take positive integer input and tell if it is a three digit number or not

package conditional;
import java.util.*;

public class three_digit_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if (n>99 && n<1000){
            System.out.println(n);
            System.out.println("This is three digit number:");
        }
        else{
            System.out.println("THis is not three digit number ");
        }
    }
}
