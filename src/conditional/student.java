//take input percentage of a student and pritn the grade according
//to marks


package conditional;
import java.util.*;


public class student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter percentage: ");
        int per=sc.nextInt();
        if(per>91){
            System.out.println("excellent");
        } else if (per>80 && per>91) {
            System.out.println("very good");


        } else if (per>70 && per<80) {
            System.out.println("good");

        } else if (per>60 && per<70) {
            System.out.println("can do better");

        } else if (per>50 && per<60) {
            System.out.println("average");

        } else if (per>40 && per<50) {
            System.out.println("below average");

        }
        else{
            System.out.println("fail");
        }

    }
}
