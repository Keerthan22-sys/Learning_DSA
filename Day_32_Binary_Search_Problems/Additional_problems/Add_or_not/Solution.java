import java.util.Arrays;

public class Solution {
    public int[] addOrNot(int[] A, int B) {
        Arrays.sort(A); // Sort the array
        
        int n = A.length;
        int maxFreq = 0, numWithMaxFreq = Integer.MAX_VALUE;

        // Two pointers for sliding window
        int left = 0;
        long operations = 0;

        for (int right = 0; right < n; right++) {
            // Calculate operations to make all elements in the window equal to A[right]
            operations += (long) (A[right] - (right > 0 ? A[right - 1] : 0)) * (right - left);

            // If operations exceed B, shrink the window from the left
            while (operations > B) {
                operations -= A[right] - A[left];
                left++;
            }

            // Update max frequency and number with max frequency
            int currentFreq = right - left + 1;
            if (currentFreq > maxFreq || (currentFreq == maxFreq && A[right] < numWithMaxFreq)) {
                maxFreq = currentFreq;
                numWithMaxFreq = A[right];
            }
        }

        return new int[]{maxFreq, numWithMaxFreq};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] A1 = {1, 2, 2, 2, 3};
        int B1 = 1;
        System.out.println(Arrays.toString(solution.addOrNot(A1, B1))); // Expected: [4, 2]
    }
}
