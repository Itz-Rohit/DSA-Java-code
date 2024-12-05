//given a point (x,y),write a program to find out if it lies on the x-axxis,y-axis or at the origin viz(0,0)

package conditional;
import java.util.*;

public class xaxisyaxisorigin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first point");
        int a=sc.nextInt();
        System.out.println("Enter the second point ");
        int b=sc.nextInt();
        if(a==0 && b==0){
            System.out.println("The point is on origin ");

        } else if (a==0 && b!=0) {
            System.out.println("The point is on y axis");

        } else if (a!=0 && b==0) {
            System.out.println("The point is on x axis");

        }
        else {
            System.out.println("Invalid point");
        }

    }
}
