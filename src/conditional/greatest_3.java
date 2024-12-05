//take 3 positive integres input and print the greatest among of them.

package conditional;
import java.util.*;

public class greatest_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int p=sc.nextInt();
        System.out.println("Enter the second number");
        int q=sc.nextInt();
        System.out.println("Enter the third number");
        int r=sc.nextInt();
        if (p>q && p>r){
            System.out.println("P is rhe largest number ");
            System.out.println(p);
        }
        else if (q>p && q>r){
            System.out.println("q is the largest number");
            System.out.println(q);
        }
        else{
            System.out.println("r is the largest number");
            System.out.println(r);

        }

    }
}
