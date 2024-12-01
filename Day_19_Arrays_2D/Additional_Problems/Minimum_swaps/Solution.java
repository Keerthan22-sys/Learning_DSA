public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        
        // Step 1: Count how many elements are less than or equal to B
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] <= B) {
                count++;
            }
        }
        
        // If count is 0 or 1, no swaps are needed
        if (count == 0 || count == 1) {
            return 0;
        }

        // Step 2: Find the initial number of elements <= B in the first window of size `count`
        int bad = 0;
        for (int i = 0; i < count; i++) {
            if (A[i] > B) {
                bad++;
            }
        }

        // Step 3: Use a sliding window technique to find the minimum number of "bad" elements in any window of size `count`
        int minSwaps = bad;
        for (int i = 0, j = count; j < n; i++, j++) {
            // Slide the window: remove the effect of A[i] and add the effect of A[j]
            if (A[i] > B) {
                bad--;
            }
            if (A[j] > B) {
                bad++;
            }

            // Update the minimum swaps required
            minSwaps = Math.min(minSwaps, bad);
        }

        return minSwaps;
    }
}
