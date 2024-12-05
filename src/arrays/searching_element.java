package arrays;
import java.util.*;

public class searching_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>al =new ArrayList<Integer>();
        System.out.print("Enter number of element n: ");
        int n = scanner.nextInt();
        int[] arr= new int[n];
        System.out.print("The entered element is: ");
        for (int i =0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        for (int i =0;i<n;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();


        System.out.print("Enter element to be searched x: ");
        int x = scanner.nextInt();
        solution sol = new solution();
        int result = sol.search(arr,n,x);
        if(result!=-1){
            System.out.print("The value is at index " +result);
        }
        else {
            System.out.print("The value is not found");
        }


    }
}
class solution{

     public int search (int arr[] , int n , int x){
         for (int i=0;i<=n;i++){
             if(arr[i]==x){
                 return i;
             }
         }
         return -1;

    }
}