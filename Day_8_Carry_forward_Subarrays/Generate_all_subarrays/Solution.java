public class Solution {
    public int[][] solve(int[] A) {
        int n = A.length;
        int count = 0;

        // Calculate the total number of subarrays
        for (int i = 0; i < n; i++) {
            count += (n - i);
        }

        int[][] result = new int[count][];
        int index = 0;

        // Generate all possible subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int[] subarray = new int[j - i + 1];
                for (int k = i; k <= j; k++) {
                    subarray[k - i] = A[k];
                }
                result[index++] = subarray;
            }
        }

        return result;
    }
}
