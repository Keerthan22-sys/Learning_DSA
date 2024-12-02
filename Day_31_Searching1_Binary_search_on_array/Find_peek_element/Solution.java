public class Solution {
    public int solve(int[] A) {
        int N = A.length;
        int l = 0, r = N - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || A[mid] > A[mid - 1]) && (mid == N - 1 || A[mid] > A[mid + 1])) {
                return A[mid];
            }

            // Move to the side that has a larger element
            if (mid > 0 && A[mid - 1] > A[mid]) {
                r = mid - 1; // Move to the left
            } else {
                l = mid + 1; // Move to the right
            }
        }

        return 1000000000; // If no peak element exists (theoretically won't happen with valid input)
    }
}
