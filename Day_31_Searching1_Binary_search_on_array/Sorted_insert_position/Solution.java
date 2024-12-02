public class Solution {
    public int searchInsert(int[] A, int B) {
        int left = 0, right = A.length - 1;
        int result = A.length; // Default position if B is greater than all elements

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (A[mid] == B) {
                return mid; // Target value found
            } else if (A[mid] < B) {
                left = mid + 1; // Search in the right half
            } else {
                result = mid; // Update the index for the least greater element
                right = mid - 1; // Search in the left half
            }
        }

        return result;
    }
}
