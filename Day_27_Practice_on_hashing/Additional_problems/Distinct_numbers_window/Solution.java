import java.util.*;

public class Solution {
    public int[] dNums(int[] A, int B) {
        if (B > A.length) {
            return new int[0]; // If the window size is greater than the array length, return an empty array
        }

        int n = A.length;
        int[] result = new int[n - B + 1];
        Map<Integer, Integer> freqMap = new HashMap<>();
        int distinctCount = 0;

        // Initialize the first window
        for (int i = 0; i < B; i++) {
            freqMap.put(A[i], freqMap.getOrDefault(A[i], 0) + 1);
            if (freqMap.get(A[i]) == 1) {
                distinctCount++;
            }
        }
        result[0] = distinctCount;

        // Slide the window
        for (int i = B; i < n; i++) {
            // Remove the element going out of the window
            int removeElement = A[i - B];
            freqMap.put(removeElement, freqMap.get(removeElement) - 1);
            if (freqMap.get(removeElement) == 0) {
                distinctCount--;
            }

            // Add the new element coming into the window
            int addElement = A[i];
            freqMap.put(addElement, freqMap.getOrDefault(addElement, 0) + 1);
            if (freqMap.get(addElement) == 1) {
                distinctCount++;
            }

            result[i - B + 1] = distinctCount;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = {1, 2, 1, 3, 4, 3};
        int B = 3;
        int[] result = solution.dNums(A, B);
        System.out.println(Arrays.toString(result)); // Output: [2, 3, 3, 2]
    }
}

