public class Solution {
    public int[] wave(int[] A) {
        // Sort the array
        Arrays.sort(A);

        // Swap adjacent elements to create a wave pattern
        for (int i = 0; i < A.length - 1; i += 2) {
            // Swap A[i] and A[i + 1]
            int temp = A[i];
            A[i] = A[i + 1];
            A[i + 1] = temp;
        }

        return A;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] A1 = {3, 6, 5, 10, 7, 20};
        int[] A2 = {1, 2, 3, 4};

        System.out.println(Arrays.toString(solution.wave(A1))); // Example output: [5, 3, 7, 6, 20, 10]
        System.out.println(Arrays.toString(solution.wave(A2))); // Example output: [2, 1, 4, 3]
    }
}
