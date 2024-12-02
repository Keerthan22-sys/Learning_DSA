public class Solution {
    public int[] solve(int[] A) {
        quickSort(A, 0, A.length - 1);
        return A;
    }

    private void quickSort(int[] A, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(A, low, high);
            quickSort(A, low, pivotIndex - 1);  // Sort elements before pivot
            quickSort(A, pivotIndex + 1, high); // Sort elements after pivot
        }
    }

    private int partition(int[] A, int low, int high) {
        int pivot = A[high]; // Choosing the last element as pivot
        int i = low - 1;    // Index of smaller element

        for (int j = low; j < high; j++) {
            if (A[j] <= pivot) {
                i++;
                // Swap A[i] and A[j]
                swap(A, i, j);
            }
        }
        // Swap A[i + 1] and pivot (A[high])
        swap(A, i + 1, high);
        return i + 1;
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
