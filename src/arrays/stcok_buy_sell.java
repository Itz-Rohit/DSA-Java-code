package arrays;


import java.util.Arrays;

class stock{
     public int stokes(int arr[]){
         int n = arr.length;
         int profit =0;

         for (int i=1;i<n;i++){
             if (arr[i]>arr[i-1]){
                 profit +=(arr[i] - arr[i-1]);
             }

         }
         return profit;
     }
 }
public class stcok_buy_sell {
    public static void main(String[] args) {
        stock obj = new stock();
        int[] arr = {1,2,3};
        System.out.println("The given value of stock is :"+ Arrays.toString(arr));
        int result = obj.stokes(arr);
        System.out.println("Total Profit is  "+result);
    }
}
