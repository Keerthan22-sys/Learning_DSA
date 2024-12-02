public class Solution {
    public int solve(int[] A, int B) {
        int N = A.length, ans = 0;
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int partner = B - A[i];

            // Check if the partner exists in the hashmap
            if (hashmap.containsKey(partner)) {
                ans += hashmap.get(partner); // Add the count of the partner to the answer
            }

            // Update the count of the current number in the hashmap
            hashmap.put(A[i], hashmap.getOrDefault(A[i], 0) + 1);
        }

        return (int)(ans % (1_000_000_007)); // Return result modulo 10^9 + 7 to handle large outputs
    }
}
