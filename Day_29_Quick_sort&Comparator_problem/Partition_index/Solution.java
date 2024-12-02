public int partition(int[] A) {
    int n = A.length;
    int pivot = A[n - 1]; // Last element as pivot
    int i = -1; // Index for smaller element partition

    for (int j = 0; j < n - 1; j++) {
        if (A[j] < pivot) {
            i++;
            swap(A, i, j);
        }
    }

    // Place pivot in the correct position
    swap(A, i + 1, n - 1);
    return i + 1; // Partition index
}

private void swap(int[] A, int i, int j) {
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
}

