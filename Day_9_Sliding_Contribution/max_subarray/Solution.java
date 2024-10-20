public class Solution {
    public int maxSubarray(int A, int B, int[] C) {
        int maxSum = 0, currentSum = 0;
        int start = 0;

        for (int end = 0; end < A; end++) {
            currentSum += C[end];
            
            // While the current sum exceeds B, slide the window
            while (currentSum > B && start <= end) {
                currentSum -= C[start];
                start++;
            }

            // Keep track of the maximum sum that doesn't exceed B
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}
