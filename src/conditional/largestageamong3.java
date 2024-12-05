// if the ages of ram,shyam and ajay are input through the keyboard,write a progrma
//to determine the youngest of the three

package conditional;
import java.util.*;

public class largestageamong3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of Ram:");
        int ram=sc.nextInt();
        System.out.println("Enter the age of shayam:");
        int shyam=sc.nextInt();
        System.out.println("Enter the age of ajay:");
        int ajay=sc.nextInt();
        if(ram<shyam &&ram<ajay){
            System.out.println("Ram is the youngest among three");
        } else if (shyam<ram && shyam<ajay) {
            System.out.println("shyam is the youngest");


        }
        else{
            System.out.println("ajay is the youngest");
        }
    }

}
