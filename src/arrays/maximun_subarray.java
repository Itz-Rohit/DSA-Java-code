package arrays;


import java.util.Arrays;

class ma{
    public int subarray(int arr[]){
        int res = arr[0];
        int maxending = arr[0];
        for (int i=1;i<arr.length;i++){
            maxending = Math.max(maxending + arr[i] , arr[i]);
            res = Math.max(res,maxending);
        }
        return res;
    }
}

public class maximun_subarray {
    public static void main(String[] args) {
        ma obj = new ma();
        int [] arr = {2,3,4,-1,-8,9};
        System.out.println("The given array is :"+ Arrays.toString(arr));
        int result = obj.subarray(arr);
        System.out.println("Maximum Array is :"+result);
    }
}
