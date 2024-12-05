package conditional;
import java.util.*;
public class absolute_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Absolute value of number is "+n*(-1));
        }
        else {
            System.out.println("Absolute value of number is " + n);
        }
    }

}
