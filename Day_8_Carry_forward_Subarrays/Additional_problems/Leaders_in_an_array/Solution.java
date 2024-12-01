public class Solution {
    public int[] solve(int[] A) {
        int n = A.length;
        int[] leaders = new int[n];
        int leaderCount = 0;

        int maxRight = A[n - 1];
        leaders[leaderCount++] = maxRight;

        for (int i = n - 2; i >= 0; i--) {
            if (A[i] > maxRight) {
                maxRight = A[i];
                leaders[leaderCount++] = maxRight;
            }
        }

        int[] result = new int[leaderCount];
        for (int i = 0; i < leaderCount; i++) {
            result[i] = leaders[i];
        }

        return result;
    }
}

