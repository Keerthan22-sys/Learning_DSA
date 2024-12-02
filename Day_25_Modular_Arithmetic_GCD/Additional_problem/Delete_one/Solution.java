public class Solution {
    public int solve(int[] A) {
        int N = A.length;
        if (N == 2) {
            // If the array has only two elements, return the max of those two as deleting one of them results in the other
            return Math.max(A[0], A[1]);
        }

        // Step 1: Calculate prefix and suffix GCD arrays
        int[] prefixGCD = new int[N];
        int[] suffixGCD = new int[N];
        
        // Compute prefix GCD array
        prefixGCD[0] = A[0];
        for (int i = 1; i < N; i++) {
            prefixGCD[i] = gcd(prefixGCD[i - 1], A[i]);
        }
        
        // Compute suffix GCD array
        suffixGCD[N - 1] = A[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            suffixGCD[i] = gcd(suffixGCD[i + 1], A[i]);
        }
        
        // Step 2: Find the maximum GCD by removing each element
        int maxGCD = Math.max(suffixGCD[1], prefixGCD[N - 2]); // Check if removing first or last gives max GCD
        for (int i = 1; i < N - 1; i++) {
            int gcdExcludingI = gcd(prefixGCD[i - 1], suffixGCD[i + 1]);
            maxGCD = Math.max(maxGCD, gcdExcludingI);
        }
        
        return maxGCD;
    }

    // Helper method to compute GCD of two numbers
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
