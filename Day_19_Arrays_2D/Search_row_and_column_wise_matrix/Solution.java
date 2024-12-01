public class Solution {
    public int solve(int[][] A, int B) {
        int N = A.length; // Number of rows
        int M = A[0].length; // Number of columns
        int i = 0, j = M - 1; // Start from the top-right corner
        int result = -1; // Initialize result as -1

        while (i < N && j >= 0) {
            if (A[i][j] == B) {
                int temp = (i + 1) * 1009 + (j + 1); // Calculate the current position
                if (result == -1 || temp < result) {
                    result = temp; // Update the smallest position found so far
                }
                j--; // Move left to explore other possibilities
            } else if (A[i][j] < B) {
                i++; // Move down
            } else {
                j--; // Move left
            }
        }
        return result; // Return the smallest position found
    }
}