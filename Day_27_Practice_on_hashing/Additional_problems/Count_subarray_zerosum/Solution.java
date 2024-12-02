public class Solution {
    public int solve(int[] A) {
        // Modulo for large numbers
        int MOD = 1000000007;

        // HashMap to store prefix sums and their counts
        Map<Long, Integer> prefixSumMap = new HashMap<>();
        long prefixSum = 0;
        int count = 0;

        // Initialize with prefix sum 0 for the case where the subarray starts from index 0
        prefixSumMap.put(0L, 1);

        for (int num : A) {
            prefixSum += num;

            // If the prefix sum is already in the map, add the frequency to the count
            if (prefixSumMap.containsKey(prefixSum)) {
                count = (count + prefixSumMap.get(prefixSum)) % MOD;
            }

            // Increment the frequency of the current prefix sum
            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
