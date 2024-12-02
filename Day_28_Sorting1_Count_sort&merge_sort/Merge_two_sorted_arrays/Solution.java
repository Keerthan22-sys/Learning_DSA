public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A, final int[] B) {
        int m = A.length; // Length of array A
        int n = B.length; // Length of array B
        int[] result = new int[m + n]; // Result array to hold the merged output
        int i = 0, j = 0, k = 0; // Pointers for A, B, and result arrays

        // Merge the two arrays
        while (i < m && j < n) {
            if (A[i] <= B[j]) {
                result[k++] = A[i++];
            } else {
                result[k++] = B[j++];
            }
        }

        // Copy remaining elements from A, if any
        while (i < m) {
            result[k++] = A[i++];
        }

        // Copy remaining elements from B, if any
        while (j < n) {
            result[k++] = B[j++];
        }

        return result; // Return the merged array
    }
}
