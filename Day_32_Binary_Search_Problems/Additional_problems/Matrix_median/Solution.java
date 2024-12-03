package Additional_problems.Matrix_median;
public class Solution {
    public int findMedian(int[][] A) {
        int N = A.length;        // Number of rows
        int M = A[0].length;     // Number of columns
        
        int low = 1, high = (int) 1e9; // Range of possible values in the matrix

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int count = 0;
            for (int i = 0; i < N; i++) {
                count += countLessEqual(A[i], mid); // Count numbers <= mid in each row
            }

            if (count > (N * M) / 2) {
                high = mid - 1; // Median lies in the left half
            } else {
                low = mid + 1; // Median lies in the right half
            }
        }

        return low; // Median found
    }

    // Helper function to count numbers <= target in a sorted array
    private int countLessEqual(int[] row, int target) {
        int low = 0, high = row.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (row[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
