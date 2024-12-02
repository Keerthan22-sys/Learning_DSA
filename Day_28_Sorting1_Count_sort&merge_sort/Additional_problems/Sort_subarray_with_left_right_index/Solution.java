import java.util.Arrays;

public class Solution {
    public int[] sortSubarray(int[] A, int B, int C) {
        // Copy the subarray to a temporary array
        int[] subarray = Arrays.copyOfRange(A, B, C + 1);

        // Sort the temporary array
        Arrays.sort(subarray);

        // Place the sorted subarray back into the original array
        for (int i = B; i <= C; i++) {
            A[i] = subarray[i - B];
        }

        return A;
    }
}
