public class Solution {
    public int solve(int[] A, int[] B) {
        if (A.length > B.length) {
            // Ensure A is the smaller array for binary search efficiency
            return solve(B, A);
        }

        int m = A.length;
        int n = B.length;
        int low = 0, high = m;

        while (low <= high) {
            int partitionA = (low + high) / 2;
            int partitionB = (m + n + 1) / 2 - partitionA;

            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : A[partitionA - 1];
            int minRightA = (partitionA == m) ? Integer.MAX_VALUE : A[partitionA];

            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : B[partitionB - 1];
            int minRightB = (partitionB == n) ? Integer.MAX_VALUE : B[partitionB];

            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                // Found the correct partition
                if ((m + n) % 2 == 0) {
                    // Even total length
                    return (int) Math.floor((Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0);
                } else {
                    // Odd total length
                    return Math.max(maxLeftA, maxLeftB);
                }
            } else if (maxLeftA > minRightB) {
                // Move left in A
                high = partitionA - 1;
            } else {
                // Move right in A
                low = partitionA + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}
