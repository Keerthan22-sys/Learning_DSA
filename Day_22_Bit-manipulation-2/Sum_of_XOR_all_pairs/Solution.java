public class Solution {
    public int solve(int[] A) {
                final int MOD = 1000000007;
        long totalSum = 0;
        int N = A.length;

        // Iterate over each bit position
        for (int bit = 0; bit < 32; bit++) {
            int count = 0;

            // Count how many numbers have the current bit set
            for (int num : A) {
                if ((num & (1 << bit)) != 0) {
                    count++;
                }
            }

            // Calculate the number of pairs contributing to this bit
            long pairs = (long) count * (N - count) % MOD;
            // Each pair contributes 2^bit to the total sum
            totalSum = (totalSum + (pairs * (1 << bit)) % MOD) % MOD;
        }

        return (int) totalSum;
    }
}
