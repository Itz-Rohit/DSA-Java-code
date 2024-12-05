package arrays;


import java.util.Arrays;

class window{
    public int sliding(int arr[] ,int k){
        int sum =0;
        int max_sum = sum;
        for (int i=0;i<k;i++){
            sum  = sum + arr[i];

        }
        for (int i=k;i< arr.length;i++){
            sum = sum + (arr[i] - arr[i-k]);
            max_sum = Math.max(sum,max_sum);

            
        }
        return max_sum;

    }
}





public class sliding_window {
    public static void main(String[] args) {
        window obj = new window();
        int[] arr = {1,2,3,4};
        System.out.println("The given array is :"+ Arrays.toString(arr));
        int result = obj.sliding(arr,3);
        System.out.println("The maximum result of sliding  : "+result);

    }
}
