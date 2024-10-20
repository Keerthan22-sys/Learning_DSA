public class Solution {
    public int[] plusOne(int[] A) {
        int n = A.length;
        
        // Traverse the digits from the last one
        for (int i = n - 1; i >= 0; i--) {
            if (A[i] < 9) {
                A[i] += 1;
                return removeLeadingZeros(A);  // No carry-over, return the result.
            }
            // Set current digit to 0 and carry 1 to the next
            A[i] = 0;
        }
        
        // If all digits are 9, we need to add a new digit 1 at the front
        int[] result = new int[n + 1]; // New array to accommodate the extra carry
        result[0] = 1; // The first digit is 1, others default to 0
        return result; // No need to call removeLeadingZeros here
    }

    private int[] removeLeadingZeros(int[] number) {
        int i = 0;
        // Find the first non-zero index
        while (i < number.length && number[i] == 0) {
            i++;
        }
        // If all are zeros, return a single zero
        if (i == number.length) {
            return new int[]{0};
        }
        // Create a new array without leading zeros
        int[] result = new int[number.length - i];
        for (int j = 0; j < result.length; j++) {
            result[j] = number[i + j];
        }
        return result;
    }
}