public class Solution {
    public int solve(int[] A) {
        int MOD = 1000000007;
        int MAX_VALUE = 1000;
        long sum = 0;
        
        // Frequency array for values from 1 to 1000
        int[] freq = new int[MAX_VALUE + 1];
        
        // Populate the frequency array
        for (int num : A) {
            freq[num]++;
        }
        
        // Calculate the sum of A[i] % A[j] for all i, j pairs
        for (int i = 1; i <= MAX_VALUE; i++) {
            if (freq[i] == 0) continue;  // Skip if there are no elements equal to i
            
            for (int j = 1; j <= MAX_VALUE; j++) {
                if (freq[j] == 0) continue;  // Skip if there are no elements equal to j
                
                // Calculate A[i] % A[j] and multiply by the frequency product
                sum = (sum + (long) (i % j) * freq[i] * freq[j]) % MOD;
            }
        }
        
        return (int) sum;
    }
}
