public class Solution {
    public int solve(int[] A, int B, int C) {
        int N = A.length;
        int currentsum = 0;

        // Calculate the sum of the first subarray of length B
        for(int i = 0; i < B; i++)
        {
            currentsum += A[i];
        }

        // If the sum of the first subarray is C, return 1
        if(currentsum == C)
        {
            return 1;
        }

        // Slide the window across the array
        for(int i = B; i < N; i++)
        {
            currentsum += A[i] - A[i-B]; // Add new element, remove the first element of the previous window
            // If the sum of the current window is C, return 1
            if(currentsum == C){
                return 1;
            }
        }
        // If no subarray of length B has sum C, return 0
        return 0;
    }
}
