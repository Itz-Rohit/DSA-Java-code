package arrays;
import java.util.*;


class Solution_Try {
    public int delete(int arr[], int n, int x) { // 2
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }
        if (i == n) {
            return n;
        }
        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
//            System.out.print(arr[j] + " ");
        }
        return n - 1;
    }
}


public class deletion_of_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.print("Enter number of elements n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Entering the numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Enter number to be deleted: ");
        int x = scanner.nextInt();

        Solution_Try sol = new Solution_Try();
        int result = sol.delete(arr, n, x);
        System.out.print("updated array Size is : "+ result + "\nUpdated array: ");

        for(int i = 0; i < result; i++){
            System.out.print(arr[i] + " ");
        }


    }
}