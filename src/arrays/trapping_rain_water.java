package arrays;

import java.util.Arrays;

class Trapped {

//    public int min(int a, int b) {
//        return Math.min(a, b);
//    }


//    public int max(int a, int b) {
//        return Math.max(a, b);
//    }

    public int getWater(int arr[]) {
        int n = arr.length;
        int res = 0;
        int[] lmax = new int[n];
        int[] rmax = new int[n];

       lmax[0]= arr[0];
       for (int i=1;i<n;i++){
           lmax[i]=Math.max(arr[i],lmax[i-1] );
       }
       rmax[n-1] = arr[n-1];
       for (int i =n-2;i>=0;i--){
           rmax[i] = Math.max(arr[i], rmax[i+1] );
       }
       for (int i=1;i<n-1;i++){
           res= res + (Math.min(lmax[i],rmax[i])  - arr[i]);
       }
       return res;

    }
}

public class trapping_rain_water {
    public static void main(String[] args) {
        Trapped obj = new Trapped();
        int[] arr = {10, 4, 5, 4, 3, 19};
        System.out.println("The given array is: " + Arrays.toString(arr));
        int result = obj.getWater(arr);
        System.out.println("The result is: " + result);
    }
}
