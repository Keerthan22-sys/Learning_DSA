public class Solution {
    private static final int MOD = 1000000007;

    // Helper function to calculate GCD
    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Helper function to calculate LCM
    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    public int solve(int A, int B, int C) {
        long lcm = lcm(B, C);
        long low = 1, high = (long) A * Math.min(B, C), result = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            // Count of magical numbers <= mid
            long count = mid / B + mid / C - mid / lcm;

            if (count >= A) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) (result % MOD);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.athMagicalNumber(5, 2, 3)); // Example test case: Output -> 8
    }
}
