import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] solve(int[][] A) {
        // List to store the merged intervals
        List<int[]> merged = new ArrayList<>();

        // Iterate through the intervals
        for (int[] interval : A) {
            // If merged list is empty or no overlap, add the current interval
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Overlap exists, so merge the current interval
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Convert the list to a 2D array and return
        return merged.toArray(new int[merged.size()][]);
    }
}
