package arrays;


import java.util.Scanner;

class solution_1{
    public int  getlargest(int arr[]){
        int res = 0;
        for (int i=1;i<arr.length;i++){
            if (arr[i] > arr[res]){
                res =i;

            }
        }
        return res;

    }

}

public class largest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter number of element:");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("entering the element:");
        for (int i=0;i<n;i++){
            arr[i] =scanner.nextInt();
        }
        System.out.println("Array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();
        solution_1 sol =new solution_1();
        int result = sol.getlargest(arr);
        int largest_index = arr[result];
        System.out.println("The largest element of the array is "+largest_index);

    }
}