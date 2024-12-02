public class Solution {
    public int[] solve(int[] A) {
        if (A.length <= 1) {
            return A; // Base case: A single-element array is already sorted
        }
        int[] temp = new int[A.length];
        mergeSortHelper(A, temp, 0, A.length - 1);
        return A;
    }

    private void mergeSortHelper(int[] A, int[] temp, int left, int right) {
        if (left >= right) {
            return; // Base case: Subarray with 0 or 1 element
        }

        int mid = left + (right - left) / 2;
        mergeSortHelper(A, temp, left, mid);       // Sort left half
        mergeSortHelper(A, temp, mid + 1, right); // Sort right half
        merge(A, temp, left, mid, right);         // Merge the two halves
    }

    private void merge(int[] A, int[] temp, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left;

        // Merge the two halves into the temp array
        while (i <= mid && j <= right) {
            if (A[i] <= A[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = A[j++];
            }
        }

        // Copy remaining elements from left half, if any
        while (i <= mid) {
            temp[k++] = A[i++];
        }

        // Copy remaining elements from right half, if any
        while (j <= right) {
            temp[k++] = A[j++];
        }

        // Copy the merged elements back to the original array
        for (int l = left; l <= right; l++) {
            A[l] = temp[l];
        }
    }
}
