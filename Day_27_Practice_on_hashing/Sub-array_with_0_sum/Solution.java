import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solve(int[] A) {
        // Set to store cumulative sums
        Set<Long> cumulativeSums = new HashSet<>();
        long sum = 0;

        // Iterate through the array
        for (int num : A) {
            sum += num;

            // Check if the cumulative sum is 0 or already exists in the set
            if (sum == 0 || cumulativeSums.contains(sum)) {
                return 1; // Subarray with sum 0 exists
            }

            // Add the cumulative sum to the set
            cumulativeSums.add(sum);
        }

        // If no subarray with sum 0 is found
        return 0;
    }
}
