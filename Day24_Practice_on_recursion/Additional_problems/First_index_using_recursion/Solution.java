public class Solution {
    public int FirstIndex(int[] A, int B) {
        return findIndexRecursive(A, B, 0);
    }
    
    // Helper recursive function
    private int findIndexRecursive(int[] A, int B, int index) {
        // Base case: if the index is out of bounds, return -1
        if (index == A.length) {
            return -1;
        }
        // If the element at the current index is B, return the index
        if (A[index] == B) {
            return index;
        }
        // Recursive call to check the next element
        return findIndexRecursive(A, B, index + 1);
    }
}
