public class Solution {
    public int[] searchRange(final int[] A, int B) {
        int[] result = new int[2];
        result[0] = findFirstOccurrence(A, B);
        result[1] = findLastOccurrence(A, B);
        return result;
    }

    private int findFirstOccurrence(int[] A, int B) {
        int left = 0, right = A.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A[mid] == B) {
                index = mid; // Update the index
                right = mid - 1; // Continue searching in the left half
            } else if (A[mid] < B) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return index;
    }

    private int findLastOccurrence(int[] A, int B) {
        int left = 0, right = A.length - 1;
        int index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A[mid] == B) {
                index = mid; // Update the index
                left = mid + 1; // Continue searching in the right half
            } else if (A[mid] < B) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return index;
    }
}
