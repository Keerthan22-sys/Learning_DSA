import java.util.*;

public class Solution {
    public int solve(int[] A) {
        // HashMap to store prefix sum and its first occurrence index
        Map<Long, Integer> prefixSumMap = new HashMap<>();
        long prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < A.length; i++) {
            prefixSum += A[i];

            // If prefixSum is zero, the subarray from the start to current index has sum zero
            if (prefixSum == 0) {
                maxLength = i + 1;
            }

            // If prefixSum is seen before, calculate the length of the subarray
            if (prefixSumMap.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(prefixSum));
            } else {
                // Otherwise, store the prefixSum with its index
                prefixSumMap.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}
