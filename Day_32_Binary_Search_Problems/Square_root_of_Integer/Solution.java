public class Solution {
    public int sqrt(int A) {
        if (A == 0 || A == 1) return A; // Handle edge cases

        int l = 1, r = A, ans = 0;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            long midSquared = (long) mid * mid; // Use long to prevent overflow

            if (midSquared == A) {
                return mid; // Perfect square
            } else if (midSquared > A) {
                r = mid - 1; // Search in the left half
            } else {
                ans = mid; // Update ans and search in the right half
                l = mid + 1;
            }
        }

        return ans; // Return floor(sqrt(A))
    }
}
