import java.util.*;
public class m {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a number: ");
        int n = scanner.nextInt(); // Read user input
        scanner.close();
        Solution solution = new Solution();
        int result = solution.trailingZeroes(n);
        System.out.println("The number of trailing zeroes in " + n + "! is: " + result);
    }
}

class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5; // Divide n by 5
            count += n; // Add the quotient to count
        }
        return count; // Return the total count of factors of 5
    }
}
