//take 3 numbers input and tell  if they can be the side of triangle

package conditional;
import java.util.*;

public class takethreeinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first side of the triangle ");
        int a= sc.nextInt();
        System.out.println("Enter the second side of the triangle");
        int b=sc.nextInt();
        System.out.println("Enter the third side of the triangle");
        int c=sc.nextInt();
        if (a+b>c && b+c>a && a+c>b){
            System.out.println("it satisfies the triangle property");
        }
        else {
            System.out.println("i do not satisfies the triangle property");
        }
    }
}
