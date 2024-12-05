package arrays;


import java.util.Arrays;

class rotate1{
    public void rotate_by_d(int arr[], int d){
      int[] temp = new int[d];
        for (int i= 0;i<d;i++){
            temp[i] = arr[i];
        }
        for (int i=d;i< arr.length;i++){
            arr[i-d] = arr[i];
        }
        for (int i =0;i<d;i++){
            arr[arr.length-d+i] =temp[i];
        }
    }
}

public class left_rotate_by_d {
    public static void main(String[] args) {
        rotate1 res = new rotate1();
        int[] arr = {1,2,3,4,5,6,6,7,8,9};
        int d=2;
        System.out.println("original Array: " + Arrays.toString(arr));
        res.rotate_by_d(arr,d);
        System.out.println("Array after left rotation:"+Arrays.toString(arr));
    }

}

