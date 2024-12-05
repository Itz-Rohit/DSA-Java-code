package stack;

import java.util.Stack;

public class largest_rectangle {

    public int maxRectangle(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;

        // Calculate maximum area for the first row
        int res = largestAreaInHistogram(mat[0], c);

        // Iterate over the rest of the rows
        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 1) {
                    mat[i][j] += mat[i - 1][j];
                }
            }
            // Update the result with the maximum area for the current row
            res = Math.max(res, largestAreaInHistogram(mat[i], c));
        }

        return res;
    }

    private int largestAreaInHistogram(int[] heights, int n) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;

        while (i < n) {
            if (stack.isEmpty() || heights[stack.peek()] <= heights[i]) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                int area = heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int area = heights[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 0, 1, 0, 0},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0}
        };

        largest_rectangle lr = new largest_rectangle();
        System.out.println("Maximum rectangle area is " + lr.maxRectangle(mat));
    }
}
