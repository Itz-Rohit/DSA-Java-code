package arrays;

import java.util.*;
class duplicate{
    public int excuse_me_duplicate(int arr[]){

//        int[] temp= new int[arr.length];
//        temp[0]=arr[0];
        int res =1;
        for (int i=1;i<arr.length;i++){
            if (arr[i]!= arr[res-1]){
                arr[res]=arr[i];
                res++;

            }
        }
        return res;




    }

}

public class removing_duplictae {
    public static void main(String[] args) {
        duplicate duplication = new duplicate();
        int[] arr = {2,3,3,3,3,4,5,5,6,6,7};
        duplicate obj = new duplicate();
        int orignal_sizee = arr.length;
        System.out.println("Size of array before removing duplication : "+orignal_sizee);
        System.out.println("original array"+Arrays.toString(arr));
        int newArr=duplication.excuse_me_duplicate(arr);


//        System.out.println("Updated array: " +newArr);
//        System.out.println("updated array: "+Arrays.toString(arr));
        System.out.println("Updated array (without duplicates): " + Arrays.toString(Arrays.copyOfRange(arr, 0, newArr)));
        System.out.println("size of array after removing duplication: "+newArr);


    }
}
