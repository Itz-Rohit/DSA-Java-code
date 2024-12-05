package Recursion;


class subbset{
    public int subsetSum(int arr[], int n, int sum) {
        // Base case: if sum becomes 0, return 1 (found a subset with given sum)
        if (sum == 0)
            return 1;

        // Base case: if no elements are left or sum becomes negative, return 0 (no subset with given sum)
        if (n == 0 || sum < 0)
            return 0;

        // Recursive cases:
        // 1. Exclude the last element and recur for remaining elements
        // 2. Include the last element and recur for remaining elements with reduced sum
        return subsetSum(arr, n - 1, sum) + subsetSum(arr, n - 1, sum - arr[n - 1]);
    }


}
public class subset_sum {
    public static void main(String[] args) {
        subbset obj = new subbset();
        int[] arr = {10,5,2,3,6};
        int n = arr.length;
        int sum = 8; // Example sum to check
        int result = obj.subsetSum(arr, n, sum);
        System.out.println("The result is " + result);

    }
}
