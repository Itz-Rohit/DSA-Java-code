package conditional;
import java.util.*;

public class profit_loss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the cost price");
        int n=sc.nextInt();
        System.out.println("Enter the selling price");
        int p=sc.nextInt();
        if (p>n){
            float profit= p-n;
            System.out.println("There is profit by "+profit);
        }
        else{
        float loss= n-p;
        System.out.println("there is loss by "+loss);

        }
    }
}
