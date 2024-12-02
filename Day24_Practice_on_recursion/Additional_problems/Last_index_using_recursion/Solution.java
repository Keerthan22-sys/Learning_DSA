public class Solution {
    public int LastIndex(int[] A, int B) {
        return findLastIndexRecursive(A, B, A.length - 1);
    }
    
    // Helper recursive function
    private int findLastIndexRecursive(int[] A, int B, int index) {
        // Base case: if the index is out of bounds, return -1
        if (index < 0) {
            return -1;
        }
        // If the element at the current index is B, return the index
        if (A[index] == B) {
            return index;
        }
        // Recursive call to check the previous element
        return findLastIndexRecursive(A, B, index - 1);
    }
}
