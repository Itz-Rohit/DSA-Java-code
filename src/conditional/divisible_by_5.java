package conditional;
import java.util.*;

public class divisible_by_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println("The entered number is divisible by 5");
        }
        else{
            System.out.println("The entered no is not divisible by 5");
        }

    }
}
