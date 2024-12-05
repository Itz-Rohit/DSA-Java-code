package arrays;


import java.util.Arrays;

class one{
    public int max(int a, int b) {
        return Math.max(a, b);
    }



    public int consecutive(int arr[]){
        int count =0; // 122332
        int res= arr[0];
        for (int i=1;i< arr.length;i++){
            if (arr[i]==res){
                count++;
            }
            else{
                res = arr[i];
                res = Math.max(res,count);
            }
        }
        return res;
    }

}

public class consecutive_1 {
    public static void main(String[] args) {
        one obj = new one();
        int[] arr = {2,3,3,5,6,7,8,9,0};
        System.out.println("The given array is "+ Arrays.toString(arr));
        int res = obj.consecutive(arr);
        System.out.println("The answer is "+res);
    }
}
