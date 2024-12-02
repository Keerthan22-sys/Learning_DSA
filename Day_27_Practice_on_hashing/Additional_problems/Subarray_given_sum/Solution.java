import java.util.*;

public class Solution {
    public int[] solve(int[] A, int B) {
        int start = 0;
        long currentSum = 0; // Use long to handle large sums

        for (int end = 0; end < A.length; end++) {
            currentSum += A[end];

            // Shrink the window from the left if the sum exceeds B
            while (currentSum > B && start <= end) {
                currentSum -= A[start];
                start++;
            }

            // If the sum equals B, return the subarray
            if (currentSum == B) {
                int[] result = new int[end - start + 1];
                for (int i = start; i <= end; i++) {
                    result[i - start] = A[i];
                }
                return result;
            }
        }

        // If no subarray is found, return [-1]
        return new int[]{-1};
    }
}
