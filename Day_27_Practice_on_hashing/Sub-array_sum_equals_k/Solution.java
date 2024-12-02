import java.util.HashMap;

public class Solution {
    public int solve(int[] A, int B) {
        int N = A.length;
        int sum = 0, count = 0;

        // HashMap to store prefix sum frequencies
        HashMap<Integer, Integer> prefixSumFreq = new HashMap<>();

        for (int i = 0; i < N; i++) {
            sum += A[i]; // Calculate prefix sum

            // Check if the prefix sum equals B
            if (sum == B) {
                count++;
            }

            // Check if (sum - B) exists in the HashMap
            if (prefixSumFreq.containsKey(sum - B)) {
                count += prefixSumFreq.get(sum - B);
            }

            // Update the frequency of the current prefix sum
            prefixSumFreq.put(sum, prefixSumFreq.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
