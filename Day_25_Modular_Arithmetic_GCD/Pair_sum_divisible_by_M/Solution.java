public class Solution {
    public int solve(int[] A, int B) {
        int MOD = 1_000_000_007;
        int[] freq = new int[B];
        long result = 0;

        for (int num : A) {
            int remainder = num % B;
            if (remainder < 0) remainder += B; // Ensure non-negative remainder

            int target = (B - remainder) % B;
            result = (result + freq[target]) % MOD;

            freq[remainder]++;
        }

        return (int) result;
    }
}
