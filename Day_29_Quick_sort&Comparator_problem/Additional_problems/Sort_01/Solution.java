public class Solution {
    public int[] sort01(int[] A) {
        int left = 0;
        int right = A.length - 1;

        // Two-pointer approach
        while (left < right) {
            // Increment left pointer if current element is 0
            while (left < right && A[left] == 0) {
                left++;
            }
            // Decrement right pointer if current element is 1
            while (left < right && A[right] == 1) {
                right--;
            }
            // Swap elements if needed
            if (left < right) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
                right--;
            }
        }

        return A;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] A1 = {1, 0, 1, 0, 1, 0};
        int[] result1 = solution.sortZeroOne(A1);
        System.out.println(java.util.Arrays.toString(result1)); // Output: [0, 0, 0, 1, 1, 1]

        int[] A2 = {0, 1, 1, 0, 1};
        int[] result2 = solution.sortZeroOne(A2);
        System.out.println(java.util.Arrays.toString(result2)); // Output: [0, 0, 1, 1, 1]
    }
}
