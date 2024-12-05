package arrays;

import java.util.Scanner;

class sort{

    public boolean  yes_or_no(int arr[]){
        for (int i=1;i<arr.length;i++){
            if (arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;


    }
}









public class sorted_or_not {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter element you want to check  ");
        int n= scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Entering the element :");
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("The array is:");
        for(int value : arr){
            System.out.println(value + " ");
        }

//        int arr[] = {1,2,3,4,5,6,7,8,};
        sort sorting = new sort();
        boolean result = sorting.yes_or_no(arr);
        System.out.println("is the given array ascending true/fasle: " +result);


    }
}
