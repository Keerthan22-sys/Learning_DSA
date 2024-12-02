public class Solution {
    public int solve(int[] A) {
        int maxChunks = 0;
        int maxInChunk = 0;

        for (int i = 0; i < A.length; i++) {
            maxInChunk = Math.max(maxInChunk, A[i]); // Track the maximum value in the current chunk
            if (maxInChunk == i) { // If the maximum value equals the current index, a chunk can be formed
                maxChunks++;
            }
        }

        return maxChunks;
    }
}
