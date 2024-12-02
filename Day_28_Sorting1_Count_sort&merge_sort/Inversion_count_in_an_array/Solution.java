public class Solution {
    private static final int MOD = 1000000007;

    public int solve(int[] A) {
        return (int) mergeSortAndCount(A, 0, A.length - 1) % MOD;
    }

    private long mergeSortAndCount(int[] A, int start, int end) {
        if (start >= end) {
            return 0; // Base case: single element or invalid range
        }

        int mid = start + (end - start) / 2;
        long leftCount = mergeSortAndCount(A, start, mid); // Count inversions in left half
        long rightCount = mergeSortAndCount(A, mid + 1, end); // Count inversions in right half
        long mergeCount = mergeAndCount(A, start, mid, end); // Count inversions during merge

        return (leftCount + rightCount + mergeCount) % MOD;
    }

    private long mergeAndCount(int[] A, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        long count = 0;

        while (i <= mid && j <= end) {
            if (A[i] <= A[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = A[j++];
                count += (mid - i + 1); // All remaining elements in the left half are inversions
                count %= MOD;
            }
        }

        while (i <= mid) {
            temp[k++] = A[i++];
        }

        while (j <= end) {
            temp[k++] = A[j++];
        }

        // Copy sorted elements back to the original array
        System.arraycopy(temp, 0, A, start, temp.length);

        return count;
    }
}
