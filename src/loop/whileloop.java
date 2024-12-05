package loop;
import java.util.*;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the the number you want to print ");
        int n=sc.nextInt();
        int sum =0;
        int num=1;
        while(num<=n){
            System.out.println(num);
            sum=sum+num;
            num++;


        }
        System.out.println(sum+ "is the sum ");

    }
}
