public class Solution {
    public int solve(int[] A) {
        int N=A.length;
        if (N==0)
            return 0;

        int minValue = Integer.MAX_VALUE, maxValue = Integer.MIN_VALUE;
        for(int num : A)
        {
            minValue = Math.min(minValue, num);
            maxValue = Math.max(maxValue, num);
        }

        int lastMinIndex = -1, lastMaxIndex = -1;
        int minLength = N;

        for (int i = 0; i < N; i++) {
            // If the current element is the minimum value
            if (A[i] == minValue) {
                lastMinIndex = i;
                if (lastMaxIndex != -1) {
                    minLength = Math.min(minLength, i - lastMaxIndex + 1);
                }
            }
            // If the current element is the maximum value
            if (A[i] == maxValue) {
                lastMaxIndex = i;
                if (lastMinIndex != -1) {
                    minLength = Math.min(minLength, i - lastMinIndex + 1);
                }
            }
        }
        
        // Return the length of the smallest subarray
        return minLength;
    }
}
