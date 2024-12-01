public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + A[i];
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= B; i++) {
            maxSum = Math.max(maxSum, prefixSum[n] - prefixSum[n - B + i] + prefixSum[i]);
        }

        return maxSum;
    }
}

