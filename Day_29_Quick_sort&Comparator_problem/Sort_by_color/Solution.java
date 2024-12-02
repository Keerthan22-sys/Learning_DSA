public class Solution {
    public int[] sortColors(int[] A) {
        int low = 0, mid = 0, high = A.length - 1;

        while (mid <= high) {
            if (A[mid] == 0) {
                // Swap A[low] and A[mid], increment both
                swap(A, low, mid);
                low++;
                mid++;
            } else if (A[mid] == 1) {
                // Move mid pointer forward
                mid++;
            } else { // A[mid] == 2
                // Swap A[mid] and A[high], decrement high
                swap(A, mid, high);
                high--;
            }
        }

        return A;
    }

    // Helper function to swap elements in the array
    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
