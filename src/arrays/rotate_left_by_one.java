package arrays;


import java.util.Arrays;

class rotate{
    public void rotate_one(int arr[]){
//        int high = arr.length-1;
        int temp = arr[0];
        for (int i=1;i< arr.length;i++){
            arr[i-1] = arr[i];

        }
        arr[arr.length -1] = temp;

    }
}
public class rotate_left_by_one {
    public static void main(String[] args) {
        rotate res = new rotate();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("original Array: " + Arrays.toString(arr));
        res.rotate_one(arr);
        System.out.println("Array after left Rotation :"+Arrays.toString(arr));

    }
}
