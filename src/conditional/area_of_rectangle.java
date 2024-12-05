package conditional;
import java.util.*;

public class area_of_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        int length=sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth=sc.nextInt();
        int area=length*breadth;
        int perimeter=2*(length+breadth);
        if(area>perimeter){
//            System.out.println("area :"area);
//            System.out.println("perimeter :"perimeter);
            System.out.println("The area is greater than perimetere");
        }
        else{
            System.out.println("area :"+area);
            System.out.println("perimeter :"+perimeter);
            System.out.println("The perimeter is greater than area");
        }


    }
}
