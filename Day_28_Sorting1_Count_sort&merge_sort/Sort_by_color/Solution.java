public class Solution {
    public int[] sortColors(int[] A) {
        int low = 0;          // Pointer for 0 (red)
        int mid = 0;          // Pointer for traversal
        int high = A.length - 1; // Pointer for 2 (blue)
        
        while (mid <= high) {
            if (A[mid] == 0) {
                // Swap A[low] and A[mid], increment both pointers
                int temp = A[low];
                A[low] = A[mid];
                A[mid] = temp;
                low++;
                mid++;
            } else if (A[mid] == 1) {
                // Move the mid pointer if it's white
                mid++;
            } else {
                // Swap A[mid] and A[high], decrement the high pointer
                int temp = A[high];
                A[high] = A[mid];
                A[mid] = temp;
                high--;
            }
        }
        
        return A;
    }
}
