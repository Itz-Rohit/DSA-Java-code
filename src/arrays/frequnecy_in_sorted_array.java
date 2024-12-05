package arrays;

import java.util.Arrays;

class Frequency {
    public void fre(int arr[]) {
        int n = arr.length;
        int i = 1;

        while (i < n) {
            int freq = 1;
            while (i < n && arr[i] == arr[i - 1]) {
                i++;
                freq++;
            }
            System.out.println(arr[i - 1] + " " + freq);
            i++;
        }
        if (n == 1 || arr[n - 1] != arr[n - 2]) {
            System.out.println(arr[n - 1] + " " + 1);
        }
    }
}

public class frequnecy_in_sorted_array{
    public static void main(String[] args) {
        Frequency obj = new Frequency();
        int[] arr = {1, 2, 2, 2, 2, 3, 3, 3, 34, 4, 4, 4, 45, 5, 5, 6};
        System.out.println("The given array is : " + Arrays.toString(arr));
        obj.fre(arr);
    }
}
