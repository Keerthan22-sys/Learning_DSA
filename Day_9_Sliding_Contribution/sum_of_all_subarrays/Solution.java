public class Solution {
    public long subarraySum(int[] A) {
        long totalSum = 0;
        int length = A.length;
        
        for (int i = 0; i < length; i++) {
            // Each element A[i] contributes to (i + 1) * (length - i) subarrays
            totalSum += (long) A[i] * (i + 1) * (length - i);
        }
        
        return totalSum;
    }
}
