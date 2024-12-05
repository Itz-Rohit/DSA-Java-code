package arrays;

import java.util.Arrays;

class max{
    public int maximum(int arr[]){
        int res =arr[1]-arr[0];
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
//                res max(res,arr[j] - arr[i]);
                if (arr[j] - arr[i] > res) {
                    res = arr[j] - arr[i];
                }
            }
        }
        return res;
    }
//    public int max(int a, int b) {
//        return a > b ? a : b;
//    }
}
public class maxmimun_difference {
    public static void main(String[] args) {
        max obj = new max();


        int[] arr = {31,10,8,2};
        System.out.println("The given array is :"+Arrays.toString(arr));


        int maxDiff = obj.maximum(arr);


        System.out.println("Maximum difference: " + maxDiff);
    }
}
