public class Solution {
    public int firstMissingPositive(int[] A) {
        int n = A.length;
        
        // Step 1: Rearrange elements to their correct positions
        for (int i = 0; i < n; i++) {
            while (A[i] > 0 && A[i] <= n && A[A[i] - 1] != A[i]) {
                // Swap A[i] with A[A[i] - 1]
                int temp = A[i];
                A[i] = A[A[i] - 1];
                A[temp - 1] = temp;
            }
        }
        
        // Step 2: Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }
        
        // If all positions are filled correctly, the missing number is N + 1
        return n + 1;
    }

}
