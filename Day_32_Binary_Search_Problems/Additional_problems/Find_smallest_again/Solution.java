import java.util.Arrays;

public class Solution {
    public int solve(int[] A, int B) {
        int N = A.length;
        Arrays.sort(A);

        // Define binary search range
        int low = A[0] + A[1] + A[2]; // Minimum triplet sum
        int high = A[N - 1] + A[N - 2] + A[N - 3]; // Maximum triplet sum
        int result = 0;

        // Perform binary search
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (countTriplets(A, mid) >= B) {
                result = mid;
                high = mid - 1; // Try smaller sums
            } else {
                low = mid + 1; // Try larger sums
            }
        }

        return result;
    }

    // Function to count triplets with sum <= target
    private int countTriplets(int[] A, int target) {
        int N = A.length;
        int count = 0;

        for (int i = 0; i < N - 2; i++) {
            int j = i + 1;
            int k = N - 1;

            // Two-pointer approach for counting pairs
            while (j < k) {
                int sum = A[i] + A[j] + A[k];
                if (sum <= target) {
                    count += (k - j); // All pairs (j, ..., k) are valid
                    j++;
                } else {
                    k--; // Reduce the sum
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {1, 2, 3, 4, 5};
        int B = 3;
        System.out.println(solution.findBthSmallest(A, B)); // Example: Output -> 9
    }
}
