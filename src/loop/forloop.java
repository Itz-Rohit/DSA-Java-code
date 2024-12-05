package loop;
import java.util.*;

public class forloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number");
        int a=sc.nextInt();
        int sum=0;
        for (int num=a;num>=-1;num-=2){
            System.out.println(num);
            sum=sum+num;
        }
        System.out.println(sum);
    }
}
