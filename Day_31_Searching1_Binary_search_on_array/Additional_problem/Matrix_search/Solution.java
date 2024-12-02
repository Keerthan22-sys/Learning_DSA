public class Solution {
    public int searchMatrix(int[][] A, int B) {
        int N = A.length;       // Number of rows
        int M = A[0].length;    // Number of columns
        
        // Start from the top-right corner of the matrix
        int row = 0;
        int col = M - 1;

        // Traverse the matrix
        while (row < N && col >= 0) {
            if (A[row][col] == B) {
                return 1;  // B found
            } else if (A[row][col] > B) {
                col--;  // Move left
            } else {
                row++;  // Move down
            }
        }

        return 0;  // B not found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[][] A1 = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        System.out.println(solution.searchMatrix(A1, 3));  // Output: 1

        // Example 2
        int[][] A2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        System.out.println(solution.searchMatrix(A2, 13));  // Output: 0
    }
}
