package arrays;
import java.util.*;

class array_reverse{
    public void reversing(int arr[]){
        int low =0; int high = arr.length-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}

public class reverse {
    public static void main(String[] args) {
        array_reverse reverser = new array_reverse();


        int[] arr = {1, 2, 3, 4, 5};


        System.out.println("Original array: " + Arrays.toString(arr));


        reverser.reversing(arr);


        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}