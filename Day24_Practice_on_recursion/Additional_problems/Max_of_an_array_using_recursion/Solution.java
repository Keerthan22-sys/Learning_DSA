public class Solution {
    public int getMax(int[] A) {
        return findMaxRecursive(A, A.length);
    }
    
    // Helper recursive function
    private int findMaxRecursive(int[] A, int n) {
        // Base case: if there's only one element, return it as the maximum
        if (n == 1) {
            return A[0];
        }
        
        // Recursive case: find the maximum of the remaining array
        return Math.max(A[n - 1], findMaxRecursive(A, n - 1));
    }
}

