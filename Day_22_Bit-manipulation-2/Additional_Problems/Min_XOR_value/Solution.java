public class Solution {
    public int findMinXor(int[] A) {
                // Step 1: Sort the array
        Arrays.sort(A);
        
        int minXOR = Integer.MAX_VALUE;

        // Step 2: Calculate XOR for adjacent pairs
        for (int i = 0; i < A.length - 1; i++) {
            int xorValue = A[i] ^ A[i + 1];
            minXOR = Math.min(minXOR, xorValue);
        }

        return minXOR;
    }
}

