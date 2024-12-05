package arrays;

import java.util.Arrays;

class zero{
    public void zerotoanend(int arr[]){
        int n = arr.length;
        for (int i=0;i<n;i++){
            if (arr[i]==0){
                for (int j=i+1;j<n;j++){
                    if (arr[j]!=0) {
                        swap(arr,i,j);
                    }
                }
            }
        }

    }
    public void swap(int arr[] ,int i , int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }
}

public class move_zero_to_end {
    public static void main(String[] args) {
        zero  obj = new zero();
        int[] arr ={1,2,3,4,0,0,6,5,7};
        System.out.println("original array :"+ Arrays.toString(arr));
        obj.zerotoanend(arr);
        System.out.println("Array after moving zeros to the end:");
        for (int num : arr) {
            System.out.print(num + ",");
        }

    }
}
